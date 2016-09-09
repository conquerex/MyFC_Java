import java.util.Scanner;

public class Baseball {

    public static void main(String[] args) {
        
        int[] pitcher = new int[4];
        int[] batter = new int[4];
        int cnt_limit = 20; 
        String str_pit = "";
        
        // 중복이 제거된 랜덤 야구공 4개 생성 
        for (int i = 0; i < pitcher.length; i++) {
            pitcher[i] = (int)(Math.random()*10);
            for (int j = 0; j < i; j++) {
                if(pitcher[i] == pitcher[j]){
                    i--;
                    break;
                }
            }
        }
        
        // 정답 
        System.out.println(""+pitcher[0]+pitcher[1]+pitcher[2]+pitcher[3]);
        
        
        for (int k = 0; k < cnt_limit ; k++) {
            // 입력값. 타자 만들기.
            System.out.println("공을 쳐 주세요.");
            Scanner sc = new Scanner(System.in);
            // 유저가 공백 입력하는 경우까지 허용 
            String input = sc.nextLine().replaceAll(" ", "");        
            
            // 4자리 숫자 체크 
            while(input.length()>4){
                System.out.println("4자리 숫자로 입력해 주세요. (좋은말 할 때)");
                input = sc.nextLine().replaceAll(" ", "");
            }
            
            // 공 4개 분리 
            for (int i = 0; i < batter.length; i++) {
                batter[i] = Integer.parseInt(input.charAt(i)+"");
                // System.out.println(batter[i]);
            }
            
            // 비교
            int cnt_bll = 0;
            int cnt_str = 0;
            
            for (int i = 0; i < pitcher.length; i++) {
                for (int j = 0; j < batter.length; j++) {
                    if(pitcher[i] == batter[j]){
                        if(i==j){
                            cnt_str++;
                        } else {
                            cnt_bll++;
                        }
                    }
                }
            }
            if(cnt_str == 4) {
                System.out.println((k+1)+"구 만에 홈런!!!!!");
                break;
            }
            System.out.println("스트라이크 : 볼 = "+cnt_str+" : "+cnt_bll);
        }
    }    
}
