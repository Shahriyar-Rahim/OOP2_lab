package problem_2;

class Animal{
    String species;

    Animal(){}
    Animal(String n){
        this.species = n;
    }

    void displaySpecies()
    {
        System.out.println("Species: " + species);
    }
}


class Mammal extends Animal{
    String nname;

    Mammal(){}
    Mammal(String m){
        this.nname = m;
    }
}

class Dog extends Mammal{
    String rr;
    Dog(String p, String q, String r){

    }
}

public class Main {
}
