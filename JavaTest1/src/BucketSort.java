import java.util.HashMap;

public class BucketSort {
    public static void main(String[] args) {
        HashMap<Integer, Integer[]> result = new HashMap<>();
        int num[] = new int[10];
        int key = 0;
        int val = 0;
        int cnt = 10;
        int bucket = 0;
        
        // 랜덤 배열 만들기 
        for (int i = 0; i < num.length; i++) {
            val = (int)(Math.random()*100);
            System.out.println(key + " / " +val);
            num[i] = val;
        }
        
        for (int i = 0; i < num.length; i++) {
            bucket = num[i]/10;
            key = bucket*100+i;
            // result.put(key, num[i]);
        }
        
        
        
        
        
    }
}
