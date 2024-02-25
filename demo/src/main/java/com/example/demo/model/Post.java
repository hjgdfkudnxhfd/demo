package com.example.demo.model;


import java.util.Date;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    String text;
    Integer likes;
    private Date creationDate;
    public Post() {}

    public Post(String text){
        this.text = text;
    }

    public Post(Long id, final String text, final Date date) {
        this.text = text;
        creationDate = date;
        likes = 0;
    }

    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(String text, Integer likes, Date creationDate){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Post(Long id, String text, Integer likes, Date creationDate){
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
}