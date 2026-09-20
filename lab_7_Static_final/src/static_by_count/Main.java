package static_by_count;

//accessing static variable using non static method and vice-verca
class Personn{
    static int a = 10;

    void show() {
        System.out.println(a);
    }
}

public class Main {
    static void main(String[] args) {
//        Personn.show(); Non-static method 'show()' cannot be referenced from a static context
//        static variable k non static method access korte parbena  & vice-verca
    }
}
