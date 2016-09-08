import java.util.ArrayList;

public class BbsMain {
    
    public static void main(String[] args) {
        // Post[] postList;
        ArrayList<Post> postList = new ArrayList<>();;
        
        Post post1 = new Post();
        Post post2 = new Post();
        
        post1.no = 1;
        post1.title = "제목";
        post1.writer = "홍길동";
        post1.date  = "2016-09-08";
        post1.contents = "아. 이건 테스트용입니다.";
        
        post2.no = 2;
        post2.title = "안녕하세요";
        post2.writer = "손종국";
        post2.date  = "2016-09-07";
        post2.contents = "두번째 글 입니다.";

        postList.add(post1);
        postList.add(post2);
        
//        post1.print();
//        post2.print();
        
        int postListSize = postList.size();
        
        // 배열을 가져오는 오래된 방식의 반복
        for (int i = 0; i < postListSize; i++) {
//            generic을 쓰지 않았을 때.
//            Post temp = (Post)postList.get(i);
//            temp.print();
            postList.get(i).print();
        }
        
        // 향상된 반복문
        // 배열 객체 안에 들어잇는 단위 객체 - 타입과 변수명을 입력
        for (Post p : postList) {
            // 반복문의 대상이 되는 배열객체
            p.print();
        }
        
        
        
    }
}

class Post{
    // 글번호
    int no;
    // 제목
    String title;
    // 작성자
    String writer;
    // 작성일자
    String date;
    // 내용
    String contents;
    
    public void print(){
        System.out.println(no + " | " + title + " | " + writer + " | " + date);
        System.out.println(contents);
        
    }
}
