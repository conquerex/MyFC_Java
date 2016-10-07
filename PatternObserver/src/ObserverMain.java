import java.util.ArrayList;
import java.util.Scanner;

public class ObserverMain {
    public static void main(String[] args) {
        TargetJob target = new TargetJob();
        new Binary(target);
        new Hex(target);
        int input = 1;
        Scanner scan = new Scanner(System.in);
        while (input > 0) {
            input = scan.nextInt();
            System.out.println("Enter a Number : "+input);
            target.setNumber(input);
        }
    }

}

// 옵저버가 바라보고 있는 실행 태스크
class TargetJob{
    // 현재 태스크를 바라보는 옵저버들을 등록해 두는 배열
    private ArrayList<Observer> observers = new ArrayList<>();
    int number = 0;
    
    // 옵저버를 등록해준다
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    // 실행 태스크에 값을 입력하고, 변경사항이 있음을 알리는 메서드를 호출한다.
    public void setNumber(int number){
        this.number = number;
        notifyChanged();
    }
    
    // 실행 태스크에 변경사항이 있으면 전체 옵저버에 알려준다.
    private void notifyChanged(){
        for(Observer o : observers){
            o.update();
        }
    }
}




abstract class Observer{
    protected TargetJob target;
    public abstract void update();
}

class Binary extends Observer{
    
    public Binary(TargetJob target){
        this.target = target;
        this.target.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary : "+Integer.toBinaryString(target.number));
    }
}


class Hex extends Observer{
    
    public Hex(TargetJob target){
        this.target = target;
        this.target.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex : "+Integer.toHexString(target.number));
    }
    
}

