import java.util.ArrayList;

public class BbsList {
    private ArrayList<Post> list = new ArrayList<>();
    private int count = 0;
    
    // CRUD
    
    public BbsList(){
        // 로직 없
    }
    
    public void addPost(Post post){
        count = count + 1;
        post.no = count;
        list.add(post);
    }
    
    public void showList(){
        if(list.size() == 0){
            System.out.println("--- 글이 없습니다요 ---");
        } else {
            for (Post post : list) {
                post.print();
            }            
        }
    }
    
    public void showPost(int no){
        boolean postExist = false;
        for(Post post : list){
            if(post.no == no){
                post.print();
                postExist = true;
                break;
            }
        }
        if(!postExist){
            System.out.println("--- "+no+"번 글이 없습니다요 ---");
        }
    }
    
    public Post getPost(int no){
        Post result = null;
        for(Post post : list){
            if(post.no == no){
                result = post;
                break;
            }
        }
        return result;
    }
    
    public void updatePost(Post newPost){
        for(Post post : list){
            if(post.no == newPost.no){
                // post = newPost;
                int idx = list.indexOf(post);
                list.set(idx, newPost);
                break;
            }
        }
    }
    
    public void deletePost(int no){
        boolean postExist = false;
        for(Post post : list){
            if(post.no == no){
                list.remove(post);
                postExist = true;
                break;
            }
        }
        if(!postExist){
            System.out.println("--- "+no+"번 글이 없습니다요 ---");
        }
    }
}
