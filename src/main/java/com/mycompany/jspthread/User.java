/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jspthread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class User {
    private String username;
    private String password;
    private List<Post>posts;

    public List<Post> getPosts() {
        return posts;
    }
    
    public User(){
        posts = new ArrayList<>();
        username = "";
        password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
