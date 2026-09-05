package Lab_4;

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

	Student(){};

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Student(Student s){ // copy constructor takes a class ang an object
		name = s.name;
		id = s.id;
	}

	//constructor can be overloaded
}

public class Main {

    public static void main(String[] pagla) { //Inter process communication IPC --> String[] args with operating system
		Student sdd = new Student();
		sdd.chName("skdsdfsdfgbf");
		sdd.display();

	Student s = new Student("SKD", 1235);
	s.chName("skdgbf");
	s.display();

	Student s2 = new Student("dsj", 3423);
	s2.display();

	Student s3 = new Student(s2);
	s3.display();

	System.out.println(pagla[0]);
	System.out.println(pagla[1]);
	System.out.println(pagla[3]); // those three codes are communicating directtly from operating system

    }
}
