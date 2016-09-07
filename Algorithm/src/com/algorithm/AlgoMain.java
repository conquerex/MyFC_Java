package com.algorithm;

public class AlgoMain {
    // 1. 함수의 이름은 sum()
    // 2. 1개의 int형 숫자를 입력으로 받는다.
    // 3. 1부터 입력받은 숫자값까지 더해서 리턴해준다.
    // 4. main 함수에서 해당 함수를 호출하여 결과값을 출력한다.
    
    // 1부터 10,000까지 숫자 8이 총 몇번나오는 카운팅 하세요.
    // 8이 포함되어 있는 모든 숫자의 갯수를 카운팅 하는게 아님
    
    public static void main(String[] args) {
        /*
        AlgoMain algo = new AlgoMain();
        int result = 0;
        int temp = 100;
        result = algo.sum(temp);
        System.out.println("1부터 "+ temp +"까지의 합은 "+ result +"이다.");
        */
        
        int maxnum = 100;
        int tarnum = 8;
        System.out.println("총 갯수 : " + numberCount(maxnum, tarnum));
    }
    
    public int sum(int num) {
        int result = 0;
        result = num*(num+1)/2;
        return result;
    }
    
    public static int numberCount(int max, int target) {
        int count = 0;
        // 1. target 변수를 String으로 바꾼다.
        String tarstr = target + "";
        
        // 2. 검색할 범위만큼 for문을 돌린다.
        for (int i = 1; i < max+1; i++) {
            // 3. 1부터 차례로 String으로 바꾼다.
            String numstr = i + "";
            
            // 4. 2자리 수 이상의 경우에는 숫자를 나누어야 한다.
            for (int j = 0; j < numstr.length(); j++) {
//                System.out.print(tarstr+" : ");
//                System.out.println(numstr.charAt(j));
                
                // 5. 나눈 숫자와 target이 일치하는지 확인하고
                // 맞으면 count를 하나씩 올린다.
                if(numstr.charAt(j) == tarstr.charAt(0)){
                    count++;
                    System.out.print(numstr+" : ");
                    System.out.println(">>> "+count);
                }
            }
        }
        
        return count;
    }
}
