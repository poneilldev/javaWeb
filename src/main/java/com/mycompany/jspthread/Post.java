/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jspthread;

/**
 *
 * @author paul
 */
public class Post {
    private String entry;
    
    public String getEntry(){
        return entry;
    }
    
    public void setEntry(String ent){
        entry = ent;
    }
    
    @Override
    public String toString(){
        
        return entry;
    }
}
