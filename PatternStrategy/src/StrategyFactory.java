
public class StrategyFactory {
    
    public static StrategyInterface newInstance(String key){
        StrategyInterface si = null;
        if (key.equals("kick")) {
            si = new Kick();
        }else if(key.equals("punch")){
            si = new Punch();
        }else if(key.equals("run")){
            si = new Run();
        }
        return si;
    }

}
