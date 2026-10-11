package com.example.firstproject.SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class SimplePostList implements PostList{

    List<Post> listOfPosts =  null;

    public SimplePostList() {
        this.listOfPosts = new ArrayList<>();
    }

    @Override
    public List<Post> getAllPost() {
        return listOfPosts;
    }

    @Override
    public void setPost(Post post) {
        listOfPosts.add(post);
    }
}
