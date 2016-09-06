package com.test;

public class StringTest {
    
    public int i = 0;
    
    public String merge(String str1, String str2){
        
        /* 1. + 연산 
         * str1 + str2 = 속도가 느리고 메모리를 차지한다.
         * jdk 1.7부터 일반적인 스트링연산은 컴파일러
         * 스트링 빌더 형태로 처리를 해줍니다.
         */
        
        // 멀티스레드 환경에서 안정적 
        StringBuffer sb = new StringBuffer();
        // 멀티스레드 환경에서 동작을 보장받을 수 없다.
        StringBuilder sb1 = new StringBuilder();
        
        sb1.append(str1);
        sb1.append(str2);
        
        //return str1 + str2;
        return sb1.toString();
    }
}
