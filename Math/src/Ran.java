import java.util.Random;

public class Ran {
    public int getRandomNumber(){
        int result = 0;
        Random random = new Random();
        result = random.nextInt(9) + 1;
        
        return result;
    }
    
    public double getRandomByMath(){
        double temp = Math.random();
        return temp;
    }
}
