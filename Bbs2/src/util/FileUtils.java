package util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.bbs.BbsList;
import com.bbs.Post;


public class FileUtils {
    
    public static ArrayList<Post> read(String fileName){
        // StringBuilder result = new StringBuilder();
        ArrayList<Post> result = new ArrayList<>();
        
        try {
            FileInputStream fis = new FileInputStream(fileName);
            // BufferedInputStream bis = new BufferedInputStream(fis);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            // int chr = 0;
            
            String buffer = "";
            
            // StringBuilder를 이용할 경우 
//            while(true){
//                buffer = br.readLine();
//                if(buffer == null) break;
//                result.append(buffer);
//                result.append("\r\n");
//            }
            int count = 0;
            while((buffer = br.readLine()) != null){
                String temp[] = buffer.split(BbsList.DB_SEPERATOR);
                Post post = new Post();
                post.no = Integer.parseInt(temp[0]);
                count = post.no;
                post.title = temp[1];
                post.writer = temp[2];
                post.date = temp[3];
                post.contents = temp[4];
                result.add(post);
                
            }
            BbsList.count = count;
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // return result.toString();
        return result;
    }
    
    public static void write(String fileName, String contents){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] byteArray = contents.getBytes();
            
            bos.write(byteArray);
            
            bos.close();
            fos.close();
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void info(String fileName){
        File file = new File(fileName);
        System.out.println("Len : "+file.length());
        System.out.println("Mod : "+file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println("Mod : "+sdf.format(file.lastModified()));
        
    }
    
    public static void createFile(String path, String fileName){
        
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        
        File file = new File(path + File.separator + fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
