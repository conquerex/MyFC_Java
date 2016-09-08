
public class SelectSort {
    
    public static void main(String[] args) {
        SelectSort select = new SelectSort();
        select.SelectSort(10, 20);
    }
    
    public void SelectSort(int cnt, int max){
        int bf_num[] = new int[cnt];
        int af_num[] = new int[cnt];
        
        // 숫자를 생성
        for (int i = 0; i < cnt; i++) {
            int ran = (int)(Math.random() * max);
            bf_num[i] = ran;
            af_num[i] = ran;
        }

        // 정렬 전 출력과 정렬 수행
        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) {
                int temp = 0;
                if(af_num[i] > af_num[j]){
                    temp = af_num[i];
                    af_num[i] = af_num[j];
                    af_num[j] = temp;
                }
            }
        }
        
        // 정렬 후 출력
        for (int i = 0; i < cnt; i++) {
            System.out.println(bf_num[i] + "\t\t" + af_num[i]);
        }

    }
}
