package static_block.and_instance;

class Person{
    static {
        System.out.println("from static person block");
    }
//    instance block
    {
        System.out.println("From instance block");
    }
}

public class MAIN {
    static void main(){
        Person p = new Person();
        Person p1 = new Person();
// it executes the the static block when the Person class is loaded, instance block  is executing when the two objects is created
    }
}
