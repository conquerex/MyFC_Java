import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BbsMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // int listCount = 1;
        
        String orderValue = "";
        String inputValue = "";
        BbsList list = new BbsList();
        
        System.out.println("----- íë¡ê·¸ë¨ ìì -----");
        
        while (true) {
            System.out.println(">>>> ëªë ¹ì´ë¥¼ ìë ¥íì¸ì. ");
            orderValue = scan.nextLine();
            
            if (orderValue.equals("/exit")) {
                break;
            } else if(orderValue.equals("/input")){
                
                Post post = new Post();
                
                setPost(post, scan);
                
                list.addPost(post);
                System.out.println("ìë ¥ ìë£ (ë°ë§ì)");
                
            } else if(orderValue.startsWith("/print")){
                // "/print"ë¡ ììíë ë´ì©ì íì 
                if(orderValue.equals("/print")) {
                    // ëª©ë¡ ë³´ì¬ì£¼ê¸°
                    list.showList();
                } else {
                    String temp[] = orderValue.split(" ");
                    
                    // print ëªë ¹ì ì«ìì¸ ìë ¥ì ë©ìì§ ì¶ë ¥ 
                    try {
                        int no = Integer.parseInt(temp[1]);
                        list.showPost(no);                        
                    } catch (NumberFormatException e) {
                        System.out.println("/print ë¤ììë ì«ìë¥¼ ìë ¥ ");
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
                    System.out.println("/print ë¤ììë ì«ìë¥¼ ìë ¥ ");
                }
                
                Post post = list.getPost(no);
                
                if (post == null) {
                    continue;
                }
                
                setPost(post, scan);
                // list.updatePost(post);
                System.out.println("ìì  ìë£ (ë°ë§ì)");
                
            } else if(orderValue.startsWith("/delete")){
                Post post = new Post();
                String temp[] = orderValue.split(" ");
                
                // delete ëªë ¹ì ì«ìì¸ ìë ¥ì ë©ìì§ ì¶ë ¥ 
                try {
                    int no = Integer.parseInt(temp[1]);
                    list.deletePost(no);
                } catch (Exception e) {
                    System.out.println("/delete ë¤ììë ì«ìë¥¼ ìë ¥ ");
//                    e.printStackTrace();
                }
                
            } else {
                System.out.println(">>>> ëªë ¹ì´ê° ìëª»ëììµëë¤. ");
            }
        }
        System.out.println("----- íë¡ê·¸ë¨ ì¢ë£ -----");
    }
    
    public static void setPost(Post post, Scanner scan){
        String inputValue = new String();
        
        System.out.println("ì ëª© ìë ¥ : ");
        inputValue = scan.nextLine();
        post.title = inputValue;
        
        System.out.println("ê¸ì´ì´ ìë ¥ : ");
        inputValue = scan.nextLine();
        while(inputValue.length() > 10){
            System.out.println("ê¸ì´ì´ ìë ¥ (10ì ì´í) : ");
            inputValue = scan.nextLine();
        }
        post.writer = inputValue;
        
        System.out.println("ë´ì© ìë ¥ : ");
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
￿