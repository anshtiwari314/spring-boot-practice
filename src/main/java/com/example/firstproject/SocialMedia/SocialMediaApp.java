package com.example.firstproject.SocialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class SocialMediaApp {
    public static void main(String[] args) {
        SpringApplication.run(SocialMediaApp.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("SocialMediaContext.xml");

        User user = (User) context.getBean("simpleuser");
        Scanner scanner = new Scanner(System.in);

        PostList postList= (PostList) context.getBean("simplepostlist");

        int option = 0;

        while(option != 3) {

            System.out.print("Select option:\n1. Add post\n2. View All Posts\n3. exit\n");
            option= scanner.nextInt();

            switch (option) {
                case 1: {
                    Post post = (Post) context.getBean("simplepost");
                    System.out.print("Enter your post\n");
                    scanner.nextLine();
                    String msg = scanner.nextLine();
                    post.setMessage(msg);
                    postList.setPost(post);
                    user.setPostList(postList);
                    break;
                }
                case 2: {
                    postList.getAllPost().forEach(post -> System.out.println(post.getMessage()));
                    break;
                }
                case 3:{
                    context.close();
                    break;
                }
            }
        }
    }
}
