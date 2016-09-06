import java.util.Random;

public class MathMain {
    // 반환형 : 반환값 없을 경우
    public static void main(String[] args) {
        
        int[] a = new int[6];
        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;
        a[5] = 16;
        
        // 배열에 값을 입력하기 위한 반복문
        for (int i = 0; i < 6; i++) {
            a[i] = MathMain.getRandomNumber();
            
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
    
    // 반환값의 형태가 integer 일 경우 
    public static int getRandomNumber(){
        int result = 0;
        Random random = new Random();
        
        result = random.nextInt(9) + 1;
        
        return result;
    }
    
}
