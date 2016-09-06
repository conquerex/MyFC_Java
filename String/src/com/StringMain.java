package com;
import com.test.StringTest;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "Hi, ";
        String str2 = "there.";
        
        // 1. 사용할 클래스를 초기
        StringTest test = new StringTest();
        
        // 2. 사용할 클래스를 통해 자원(API, method, 함수
        // 멤버변수, 멤버 )를 호출한다.
        String result = test.merge(str1,str2);
        
        System.out.println(result);
        // 문자열 길이
        System.out.println(result.length());
        // 문자열 자르기
        System.out.println(result.substring(2));
        System.out.println(result.substring(2,3));
        
        System.out.println(result.indexOf('e'));
        System.out.println(result.contains("her"));
        System.out.println(result.replace('e', 'x'));
        System.out.println(result.replaceFirst("e", "o"));
        System.out.println(result.charAt(4));
        
        String splitted[] = result.split(" ");
        
        // 입력된 배열의 개수 
        int array_count = splitted.length;
        
        for (int i = 0; i < array_count; i++) {
            System.out.print(">> ");
            System.out.println(splitted[i]);
        }
        
        for (String s : splitted) {
            System.out.println(s);
        }
    }
}
