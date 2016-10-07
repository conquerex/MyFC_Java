
public class ProxyMain {
    public static void main(String[] args) {
        // 실제 결과값만 던저주는 객체
        BbsInterface bbs = new Bbs();
        System.out.println("interface : " + bbs.read());
        
        // 실제 결과값에 부가적인 일을 하는 proxy 객체
        BbsProxy bbs2 = new BbsProxy();
        System.out.println("proxy : " + bbs2.read());
        
        
        
    }
}
