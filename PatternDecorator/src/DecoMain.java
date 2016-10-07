/*
 * 데코레이터 패턴은 실제 호출하고자 하는 객체의 결과값에
 * 부가적인 동작이 결과값에 영향을 미칩니다.
 * MVC 중 서비스(Controller)
 */
public class DecoMain {
    public static void main(String[] args) {
        BbsInterface bbs = new Bbs();
        System.out.println("interface : " + bbs.read());
        
        BbsDecorator bbs2 = new BbsDecorator();
        System.out.println("deco : " + bbs2.read());
    }

}
