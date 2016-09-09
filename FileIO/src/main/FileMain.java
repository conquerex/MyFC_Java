package main;

import com.jongkook.util.FileUtils;

public class FileMain {
    public static void main(String[] args) {
        
        String fileName = "";
        // FileUtils utils = new FileUtils();
        String contents = FileUtils.read("/Users/jongkook/workspace/Bbs2/src/BbsMain.java");
        
        System.out.println(contents);
        
        FileUtils.write("/Users/jongkook/workspace/Bbs/src/ccc.java", contents);
        FileUtils.info("/Users/jongkook/workspace/Bbs/src/ccc.java");
    }
}
