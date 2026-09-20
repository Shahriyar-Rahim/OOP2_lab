package final_keyword;

class Person{
    final String n= "Rahim";

    Person(String n){
//        this.n = n; Cannot assign a value to final variable 'n'
    }
}

public class Main {
    static void main(){
        Person p = new Person("sdubf");

    }
}

