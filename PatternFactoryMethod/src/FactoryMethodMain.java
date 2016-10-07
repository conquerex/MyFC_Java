
public class FactoryMethodMain {
    public static void main(String[] args) {
        Car car1 = CarFactory.newInstance("포르셰");
        car1.setDestination("서울", "실리콘밸리");
        car1.drive();
        
        Car car2 = CarFactory.newInstance("볼보");
        car2.setDestination("서울", "실리콘밸리");
        car2.drive();
        
        Car car3 = CarFactory.newInstance("비엠더블유");
        
    }

}
