package com.example.firstproject.SocialMedia;


import java.util.List;

public interface User {
    void setUserName(String userName);
    String getUserName();
    void setPostList(PostList postList);
    PostList getPostList();

}
