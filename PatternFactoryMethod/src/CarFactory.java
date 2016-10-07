
public class CarFactory {
    
    public static void main(String[] args) {
        
    }
    
    public static Car newInstance(String key){
        
        if (key.equals("포르셰")) {
            return new Porsche("파나메라");
        }else if (key.equals("볼보")) {
            return new Volvo("볼보");
        }else if (key.equals("비엠더블유")) {
            return new Bmw("비엠더블유");
        }else return null;
        
    }

}
