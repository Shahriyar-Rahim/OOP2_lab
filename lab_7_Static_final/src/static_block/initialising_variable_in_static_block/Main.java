package static_block.initialising_variable_in_static_block;

class Person{
    static int age;
    static {
        age = 10;
        System.out.println("From Person static block");
    }
}

class Student extends Person{
    static {
        System.out.println("From student static class");
    }
}

public class Main {
    static void main() {
//        Student s = new Student();
//        System.out.println("From main()");

//        System.out.println("Peson er age:"+ Person.age + " from main class");
//        the above code gives output from sequence Person ---> Student --> Main
        //System.out.println("akrbg"); //but now it will print only the main function ---> akrbg

        Student s = new Student();
        System.out.println("From main()");
        //now it will print --->
        // From Person static block
        //From student static class
        //From main()

    }

}
