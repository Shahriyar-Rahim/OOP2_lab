package Person;

//abstract class Person{
abstract class Person{
    String name;
    int age;
    public abstract void displayRole();

    void displayBasicInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

