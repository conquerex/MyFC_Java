
public class Singleton {
    
    private static Singleton instance = null;
    
    private Singleton(){
        // 생성을 못하게 막아준다.
    }
    
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // java synchronized
}
