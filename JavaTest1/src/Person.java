
public class Person {
    int height;
    int weight;
    int age;
    String Phone_number;
    String address;
    String email;
    String first_name;
    String last_name;
    
    public void setFirstName(String str){
        int temp = 0;
        first_name = str;
    }
    
    public Person(){
        height = 0;
        weight = 0;
        first_name = "";
        last_name = "";
    }
    
    // 멤버 변수와 지역 변수 구분 
    public Person(int height){
        this.height = height;
    }
    
    public void print(){
        System.out.println("height = "+height);
        System.out.println("weight = "+weight);
        System.out.println("first_name = "+first_name);
        System.out.println("last_name = "+last_name);
        
    }

}
