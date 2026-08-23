import java.util.Scanner;

public class DataTypes{
    public  static  void  main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int i;
        short s;
        byte b;
        long l;
        float f;
        double d;

        System.out.print("Enter interger: ");
        i = myScanner.nextInt();
        System.out.print("Enter short: ");
        s = myScanner.nextShort();
        System.out.print("Enter byte: ");
        b = myScanner.nextByte();
        System.out.print("Enter long: ");
        l = myScanner.nextLong();
        System.out.print("Enter float: ");
        f = myScanner.nextFloat();
        System.out.print("Enter double: ");
        d = myScanner.nextDouble();

        System.out.println("Integer: " + i);
        System.out.println("Short: " + s);
        System.out.println("Byte: " + b);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);



    }
}