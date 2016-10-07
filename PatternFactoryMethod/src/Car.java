
public abstract class Car {
    
    private String name;
    private String from;
    private String to;
    
    public void setFrom(String from){
        this.from = from;
    };
    public void setTo(String to){
        this.to = to;
    };
    
    public Car(String name){
        this.name = name;
    }
    
    public abstract void setDestination(String from, String to);
    
    public void drive(){
        System.out.println(name+"을 몰고 "+from+"부터 "+to+"까지 이동한다.");
    }
    
}
