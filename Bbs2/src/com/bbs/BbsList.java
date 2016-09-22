package com.bbs;
import java.io.File;
import java.util.ArrayList;

import util.FileUtils;

public class BbsList {
    
    private final String DB_PATH = "/Users/jongkook/workspace/Bbs2/test";
    private final String DB_NAME = "bbs.txt";
    private final String DB_FULLPATH = DB_PATH + File.separator + DB_NAME;
    public static final String DB_SEPERATOR = "&";
    private ArrayList<Post> list = new ArrayList<>();
    // private int count = 0;
    public static int count = 0;
    
    // CRUD
    
    public BbsList(){
        FileUtils.createFile(DB_PATH, DB_NAME);
        load();
    }
    
    public void addPost(Post post){
        count = count + 1;
        System.out.println("    " +count);
        post.no = count;
        list.add(post);
    }
    
    public void showList(){
        if(list.size() == 0){
            System.out.println("--- 글이 없습니다요 ---");
        } else {
            for (Post post : list) {
                post.print();
            }            
        }
    }
    
    public void showPost(int no){
        boolean postExist = false;
        for(Post post : list){
            if(post.no == no){
                post.print();
                postExist = true;
                break;
            }
        }
        if(!postExist){
            System.out.println("--- "+no+"번 글이 없습니다요 ---");
        }
    }
    
    public Post getPost(int no){
        Post result = null;
        for(Post post : list){
            if(post.no == no){
                result = post;
                break;
            }
        }
        return result;
    }
    
    public void updatePost(Post newPost){
        for(Post post : list){
            if(post.no == newPost.no){
                // post = newPost;
                int idx = list.indexOf(post);
                list.set(idx, newPost);
                break;
            }
        }
    }
    
    public void deletePost(int no){
        boolean postExist = false;
        for(Post post : list){
            if(post.no == no){
                list.remove(post);
                postExist = true;
                break;
            }
        }
        if(!postExist){
            System.out.println("--- "+no+"번 글이 없습니다요 ---");
        }
    }
    
    // 파일에 저장 
    public void save(){
        // list 컬렉션의 내용을 담을 변수 
        StringBuilder sb = new StringBuilder();
        
        // list 컬렉션을 반복하면서 파일에 한줄씩 저장
        for(Post post : list){
            sb.append(post.no);
            sb.append(DB_SEPERATOR);
            sb.append(post.title);
            sb.append(DB_SEPERATOR);
            sb.append(post.writer);
            sb.append(DB_SEPERATOR);
            sb.append(post.date);
            sb.append(DB_SEPERATOR);
            sb.append(post.contents);
            sb.append("\r\n");            
        }
        FileUtils.write(DB_FULLPATH, sb.toString());
    }
    
    public void load(){
        list = FileUtils.read(DB_FULLPATH);
        if(list.size() == 0){
            System.out.println("--- 글이 없습니다요 ---");
        } else {
            for (Post post : list) {
                post.print();
            }            
        }
//        String str = FileUtils.read(DB_FULLPATH);
//        System.out.println("=============");
//        System.out.println(str);
//        System.out.println("=============");
    }
}
