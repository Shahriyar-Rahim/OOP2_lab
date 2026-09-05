package Lab_4.Lab_4_1;

class Student { //there is only one public class should be in java also there should be one class file in a folder
    String name;
    int id;

    void chName(String n){
        name = n;
    }

    void display(){
        System.out.println("Name is: " +name);
        System.out.println("Id : " + id);
    }
}