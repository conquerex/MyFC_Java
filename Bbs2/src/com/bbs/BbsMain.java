package com.bbs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import util.FileUtils;

public class BbsMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // int listCount = 1;
        
        String orderValue = "";
        // String inputValue = "";
        BbsList list = new BbsList();
        
        System.out.println("----- 프로그램 시작 -----");
        
        while (true) {
            System.out.println(">>>> 명령어를 입력하세요. ");
            orderValue = scan.nextLine();
            
            if (orderValue.equals("/exit")) {
                break;
            } else if(orderValue.equals("/input")){
                
                Post post = new Post();
                
                setPost(post, scan);
                
                list.addPost(post);
                
                System.out.println("입력 완료 (반말임)");
                
            } else if(orderValue.startsWith("/print")){
                // "/print"로 시작하는 내용을 파악 
                if(orderValue.equals("/print")) {
                    // 목록 보여주기
                    // list.showList();
                    list.load();
                    
                } else {
                    String temp[] = orderValue.split(" ");
                    
                    // print 명령에 숫자외 입력시 메시지 출력 
                    try {
                        int no = Integer.parseInt(temp[1]);
                        list.showPost(no);                        
                    } catch (NumberFormatException e) {
                        System.out.println("/print 다음에는 숫자를 입력 ");
//                        e.printStackTrace();
                    }
                }
            } else if(orderValue.startsWith("/update")){
                
                String temp[] = orderValue.split(" ");
                int no = 0;
                
                try {
                    no = Integer.parseInt(temp[1]);
                    list.showPost(no);                        
                } catch (Exception e) {
                    System.out.println("/print 다음에는 숫자를 입력 ");
                }
                
                Post post = list.getPost(no);
                
                if (post == null) {
                    continue;
                }
                
                setPost(post, scan);
                // list.updatePost(post);
                System.out.println("수정 완료 (반말임)");
                
            } else if(orderValue.startsWith("/delete")){
                // Post post = new Post();
                String temp[] = orderValue.split(" ");
                
                // delete 명령에 숫자외 입력시 메시지 출력 
                try {
                    int no = Integer.parseInt(temp[1]);
                    list.deletePost(no);
                } catch (Exception e) {
                    System.out.println("/delete 다음에는 숫자를 입력 ");
//                    e.printStackTrace();
                }
                
            } else {
                System.out.println(">>>> 명령어가 잘못되었습니다. ");
            }
        }
        System.out.println("----- 프로그램 종료 -----");
        list.save();
    }
    
    public static void setPost(Post post, Scanner scan){
        String inputValue = new String();
        
        System.out.println("제목 입력 : ");
        inputValue = scan.nextLine();
        post.title = inputValue;
        
        System.out.println("글쓴이 입력 : ");
        inputValue = scan.nextLine();
        while(inputValue.length() > 10){
            System.out.println("글쓴이 입력 (10자 이하) : ");
            inputValue = scan.nextLine();
        }
        post.writer = inputValue;
        
        System.out.println("내용 입력 : ");
        inputValue = scan.nextLine();
        post.contents = inputValue;
        
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        String date = year+"-"+month+"-"+day;
        post.date = date;
    }
    
    public static void splitOrder(){
        
    }    
}
