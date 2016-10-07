
public class Context {
    public void runContext(StrategyInterface si){
        System.out.println("----- 컨텍스트 실행됨 ------");
        si.useStrategy();
        System.out.println("----- 컨텍스트 종료됨 ------");
    }

}
