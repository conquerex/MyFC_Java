import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class BbsMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // ArrayList<Post> list = new ArrayList<>();
        HashMap<Integer, Post> list = new HashMap<>();
        
        
        int listCount = 1;
        String orderValue = "";
        String inputValue = "";
        
        System.out.println("----- 프로그램 시작 -----");
        
        while (true) {
            System.out.println(">>>> 명령어를 입력하세요. ");
            orderValue = scan.nextLine();
            
            if (orderValue.equals("/exit")) {
                break;
            } else if(orderValue.startsWith("/print")){
                // "/print"로 시작하는 내용을 파악 
                if(orderValue.equals("/print")) {
                    
                    // hashmap의 목록을 가져오는 방법 1
                    for (Entry<Integer,Post> entry : list.entrySet()) {
                        //p.print();
                        System.out.println("HashMap의 키 : "+entry.getKey());
                        entry.getValue().print();
                    }
                    
                    // value만 꺼내기
                    for(Post post : list.values()){
                        post.print();
                    }
                    
                    // 방법2
                    for(Integer i : list.keySet()){
                        list.get(i).print();
                    }
                    
                    // 방법3
                    Iterator<Integer> it = list.keySet().iterator();
                    while(it.hasNext()){
                        list.get(it.next()).print();
                    }
                    
                } else {
                    String temp[] = orderValue.split(" ");
                    
                    // print 명령에 숫자외 입력시 메시지 출력 
                    try {
                        int no = Integer.parseInt(temp[1]);
                        for (Post p : list) {
                            // 해당 번호에 맞는 내용 출력 
                            if(p.no == no)
                                p.print();
                        }                        
                    } catch (NumberFormatException e) {
                        System.out.println("/print 다음에는 숫자를 입력 ");
//                        e.printStackTrace();
                    }
                }
            } else if(orderValue.equals("/input")){
                
                Post post = new Post();
                
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
                
                post.no = listCount++;
                
                // HashMap 매핑 
                list.put(post.no, post);
                System.out.println("입력 완료 (반말임)");
                
            } else {
                System.out.println(">>>> 명령어가 잘못되었습니다. ");
            }
        }
        
        System.out.println("----- 프로그램 종료 -----");
                
    }
}
