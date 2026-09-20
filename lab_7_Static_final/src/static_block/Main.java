package static_block;

public class Main{
    static {
        System.out.println("From static block");
    }

    static void main(String[] args) {
        System.out.println("From main() method");
    }

    static {
        System.out.println("From static block 2");
    }
}

