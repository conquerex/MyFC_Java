
public class MontyDoor {
    int door[] = new int[3];
    String car = "Car";
    String goat = "Goat";
    int behind = 0;
    int flag = 0;
    int choice = 0;
    
    public int[] getDoor(){
        for (int i = 0; i < 3; i++) {
            if(flag == 1){
                behind = 0;
            }else{
                behind = (int)(Math.random()*2);
                if(behind == 1) flag = 1;
                if(i == 2) behind = 1;
            }
            door[i] = behind;
            System.out.println(behind);
        }
        return door;
    }
    
    public void getChoice(){
        choice = (int)(Math.random()*3);
        if(door[choice] == 1){
            
        }else{
            
        }
    }
}
