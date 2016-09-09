
public class Euler3 {

    public static void main(String[] args) {

       euler3();
        
    }
    
    public static void euler3(){
        //double largestFF = 7.16151937E8;
        double largestFF = 0;
        
        //double num = 600851475143.0;
        double num = 6857.0;
        
        for(double i = 3 ; i < num/2 ; i=i+2 ){
            if(num % i == 0){
                largestFF=i;
                System.out.println("결과는 =  "+largestFF);
                num = num/largestFF;
            }
        }
    }
    
}