package nested_class;

class Person{
    int age;
    String name;

    Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    class address{
        String city;
        address(String c){
            this.city = c;
        }

        void show(){
            System.out.println(name + " " + age + " " + city);
        }
    }
}

public class Main {
    static void main() {
        Person p = new Person("Shahriyar", 23);

        Person.address a = p.new address("Saidpur");

        a.show();
    }
}
