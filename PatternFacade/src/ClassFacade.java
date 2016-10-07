
public class ClassFacade {

    Door door = new Door();
    Light light = new Light();
    Computer computer = new Computer();
        
    public void start(){
        // 수업을 시작
        System.out.println("------ 수업 시작 ------");
        door.open();
        light.turnOn();
        computer.turnOn();
    }
    
    public void end(){
     // 수업을 종료
        System.out.println("------ 수업 종료 ------");
        door.clolse();
        light.turnOff();
        computer.turnOff();
    }

}
