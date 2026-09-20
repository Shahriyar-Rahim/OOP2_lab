package static_class;

class Personn{
    int age;
    String name;

    Personn(String n, int a){
        this.name = n;
        this.age = a;
    }

    static class address{
        String city;
        address(String c){
            this.city = c;
        }

        void showw(){
            System.out.println(city);
        }
    }
}

public class Mainn {
    static void main(String[] args) {
        Personn.address a = new Personn.address("Saidpur");

//        a.show();
    }

    }
