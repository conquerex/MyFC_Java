import parents.Parent;
import parents.children.child;

public class ExtendsMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parents.children.child child = new child();
        
        parent.drive();
        child.drive();
        
        parent.meet();
        child.meet();
        child.meetFg();
        
    }
}
