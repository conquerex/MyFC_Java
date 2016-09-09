
public class Post {
    int no;
    String contents;
    String title;
    String writer;
    String date;

    void print(){
        System.out.println(no+"\t| "+title+"\t| "+writer);
        System.out.println(date);
        System.out.println(contents);
    }
    
}
