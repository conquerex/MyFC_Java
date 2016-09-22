package com.bbs;

public class Post {
    public int no;
    public String contents;
    public String title;
    public String writer;
    public String date;

    void print(){
        System.out.println(no+"\t| "+title+"\t| "+writer);
        System.out.println(date);
        System.out.println(contents);
    }
    
}