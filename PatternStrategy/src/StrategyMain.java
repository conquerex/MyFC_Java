
public class StrategyMain {
    
    public static void main(String[] args) {
        // 1. 전략을 사용할 주체인 컨텍스트를 생성
        Context context = new Context();
        
        StrategyInterface si1 = StrategyFactory.newInstance("kick");
        // si1.useStrategy();
        context.runContext(si1);        
        
        System.out.println("=====================");
        
        // 2. 전략을 선택
        StrategyInterface si = null;
        si = new Punch();
        // 3. 전략을 Context에 주입 후 사용
        context.runContext(si);
        
        si = new Kick();
        context.runContext(si);
        
        si = new Run();
        context.runContext(si);
        
    }
}
