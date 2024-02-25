package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    public List<Post> listAllPosts(){
        //posts = new ArrayList<>();
        posts.add(new Post((long)posts.size(),"Пост 1", 12, new Date()));
        posts.add(new Post((long)posts.size(),"Пост 2", 23, new Date()));
        posts.add(new Post((long)posts.size(),"Пост 3",52, new Date()));
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long)posts.size(), text,0, new Date()));
    }
}