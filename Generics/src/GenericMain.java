
public class GenericMain {
    public static void main(String[] args) {
        
        //String[] a = {"가","나","다","라"};
        //print(a);
        //Integer[] b = {1,2,3,4,5};
        //print(b);
        
        Pair a = new Pair<Integer, Integer>(1, 2);
        Pair b = new Pair<Integer, Character>(1, '2');
        
        compare(a,b);        
    }
    
    public static <E> void print(E[] elements){
        for(E e:elements){
            System.out.println("내용 = " + e);
        }
    }
    
    public static boolean compare(Pair a, Pair b){
        boolean same = false;
        // Pair<a, b> pair = new Pair<>();
        if (a.getKey() == b.getKey()) {
            System.out.println("----- 같은 키");
            same = true;
        }else{
            System.out.println("----- 다른 키");
            same = false;
        }
        
        if (a.getValue() == b.getValue()) {
            System.out.println("----- 같은 값");
            same = true;
        }else{
            System.out.println("----- 다른 값");
            same = false;
        }
        
        return same;
    }
}
