import java.util.ArrayList;

public class BbsList {
    private ArrayList<Post> list = new ArrayList<>();
    
    // CRUD
    
    public BbsList(){
        // 로직 없
    }
    
    public void addPost(Post post){
        list.add(post);
    }
    
    public void showList(){
        for (Post post : list) {
            post.print();
        }
    }
    
    public void showPost(int no){
        for(Post post : list){
            if(post.no == no){
                post.print();
                break;
            }
        }
    }
    
    public void updatePost(Post newPost){
        for(Post post : list){
            if(post.no == newPost.no){
                // post = newPost;
                int idx = list.indexOf(post);
                list.add(idx, newPost);
                break;
            }
        }
    }
    
    public void deletePost(int no){
        for(Post post : list){
            if(post.no == no){
                list.remove(post);
                break;
            }
        }
    }
}
