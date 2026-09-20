package com.company;

import java.util.Scanner;

class Student {
    private
    int id;
    double cgpa;
    int markst;
    int marksl;

    public
    void set(int x, double y){
        id = x;
        cgpa = y;
    }

    void  getMArks(int x, int y){
        markst = x;
        marksl = y;
    }

    int totalMarks(){
        return  marksl + markst;
    }

    double avg(){
        return totalMarks()/(double) 2;
    }

    void Display(){
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    double get_CGPA(){
        return cgpa;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter divident a: ");
        int a = sc.nextInt();

        System.out.print("Enter divisor b: ");
        int b = sc.nextInt();

        int q = a / b;
        int rem = a - (q * b);

        System.out.println("Remainder: " + rem);

        Student Shahriyar = new Student();
        Student Mantasa = new Student();

        Shahriyar.set(802345232, 3.88);
        Shahriyar.getMArks(123, 252);
        Mantasa.getMArks(345, 2542);
        Mantasa.set(3452345, 4.00);
        Student x;
        x = Shahriyar;
        Shahriyar.Display();
        Mantasa.Display();
        System.out.println("Total Marks for Shahriyar: " + Shahriyar.totalMarks());
        System.out.println("Total Marks for Mantasa: " + Mantasa.totalMarks());
        System.out.println("AAVG Mark for Shahriyar: " + Shahriyar.avg());
        System.out.println("AAVG Mark for Mantasa: " + Mantasa.avg());
        System.out.println(System.identityHashCode(Shahriyar));
        System.out.println(System.identityHashCode(Mantasa));
        System.out.println(System.identityHashCode(x));


//        System.out.println("CGPA: "+ Shahriyar.get_CGPA());
    }
}
