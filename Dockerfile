# =========================================================================
# STAGE 1: Build the application using Gradle
# =========================================================================
FROM gradle:8-jdk17 AS build-stage
WORKDIR /app

# 1. Copy the build configuration files first to leverage Docker caching dependencies
COPY build.gradle settings.gradle ./

# 2. Recreate your folder tree structure inside the builder
RUN mkdir -p src/main/java/com/example/firstproject/

# 3. SELECTIVE COPYING: Copy ONLY the specific sub-directories you want to keep
COPY src/main/java/com/example/firstproject/Todo/ ./src/main/java/com/example/firstproject/Todo/
# COPY src/main/java/com/example/firstproject/AnotherDir/ ./src/main/java/com/example/firstproject/AnotherDir/

# 4. Copy your HTML template layout pages and static assets
COPY src/main/resources/ ./src/main/resources/

# 5. Compile the Java files and package the project into a executable JAR file
RUN gradle bootJar --no-daemon

# =========================================================================
# STAGE 2: Run the application inside a lightweight JRE environment
# =========================================================================
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the compiled executable JAR file away from the heavy Gradle build stage
COPY --from=build-stage /app/build/libs/*.jar app.jar

# Expose the standard Spring Boot embedded server port
EXPOSE 5245

# Execute the application launcher
ENTRYPOINT ["java", "-jar", "app.jar"]