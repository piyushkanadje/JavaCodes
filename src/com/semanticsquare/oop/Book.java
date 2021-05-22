package com.semanticsquare.oop;

public class Book { 
    public String title;
    
    public Book(String title){
        this.title = title;
        
    }
    public Book(){}
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    public String toString(){
        return "Book[title="+title+"]";
    }
}