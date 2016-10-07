/*
 * 프록시 패턴은 실제 호출하고자 하는 객체의 결과값은
 * 그대로 유지한체 부가적인 동작을 해준다.
 * MVC 중 서비스(Controller)
 */
public class BbsProxy implements BbsInterface{

    Bbs bbs;
    
    @Override
    public String read() {
        System.out.println("proxy : 조회수 1 증가");
        bbs = new Bbs();
        return bbs.read();
    }
    
}
