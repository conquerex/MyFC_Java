import java.util.Random;

public class MathMain {
    
    public static void main(String[] args) {
        
        Ran ran = new Ran();
        
        MathMain main = new MathMain();
        main.makeLotto();
        
        // 뭐가 문제인가 
//        double temp = ran.getRandomByMath() * 100;
//        int num = (int) temp;
//        System.out.println("Lotto num : "+num);
//        while (num < 1 || num > 45) {
//            num = (int) ran.getRandomByMath() * 100;
//            System.out.println("Lotto num2 : "+num);
//            if(num > 0 && num <46){
//                System.out.println("Lotto temp : "+num);
//                num = 45;
//            }
//        }
        
    }
    
    public void makeLotto(){
        int[] a = new int[6];
        int b = 0;
        
        // Ran 생성 
        Ran ran = new Ran();
        // MathMain main = new MathMain();
        
        // 배열에 값을 입력하기 위한 반복문
        for (int i = 0; i < 6; i++) {
            a[i] = ran.getRandomByMath();
            
            // 아래 반복문에서 한 loop에 두번의 중복을 발견할 경우
            // 마지막에 중복 숫자가 다시 나타날 수 있다 (Fail)
            // 첫번째 반복문을 리셋시키면 중복을 없앨 수 있다. (Success)
            for (int j = 0; j < i; j++) {
                if(a[i] == a[j]){
                    // a[i] = MathMain.getRandomNumber();
                    i--;
                }
            }
        }
        
        // 배열의 값을 출력하기 위한 반복문
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
