package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String a = "AAA";
	    String b = "AAA";
	    System.out.println(a==b);

	    String aa = new String("Rahim");
        String bb = new String("Rahim");

        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));
        System.out.println(aa.charAt(0));

        String ab = "KARIM";

        String abb = ab.toLowerCase();
        ab=ab.toLowerCase();
        System.out.println(abb);
        System.out.println(ab);

        StringBuilder ac = new StringBuilder("KARIM");
        ac.append(" Pagla");
        System.out.println(ac);

        StringBuffer ad = new StringBuffer("KARIM");
        ad.append(" Pagla");
        System.out.println(ac);

        StringBuffer ae = new StringBuffer("KSJBG");
        ae.insert(4, 'G');
        System.out.println(ae); //KSJBGG
        ae.delete(4, 5);
        System.out.println(ae); //KSJBG

        String alpha="";
        for(int i = 0; i < 10; i++){
            char c = (char)('a'+i);
            alpha+=c;
        }
        System.out.println(alpha); //abcdefghij

        StringBuilder alphaa = new StringBuilder("");
        for(int i = 0; i < 10; i++){
            char c = (char)('a'+i);
            alphaa.append(c);
        }
        System.out.println(alphaa); //abcdefghij

        String af ="Rahim alsgn";
        String aff = af.substring(0, 4) + "A" + af.substring(5);
        System.out.println(aff); //RahiA alsgn

        StringBuilder ax = new StringBuilder("Rahim alsgn");
        ax.setCharAt(4, 'A');
        System.out.println(ax); //RahiA alsgn

        int [] arr = {1,2,3,4,5};
        for(int abbb : arr){
            System.out.print(abbb + " ");
        }
        System.out.print("\n");
        System.out.print(arr + " "); //[I@2ed94a8b
        System.out.println("\n" + Arrays.toString(arr) + " "); //[1, 2, 3, 4, 5]

        String  dd = "20";
        String  ddd = "20";
        int dx = Integer.parseInt(dd);
        int dxx = Integer.parseInt(ddd);//converts string to integer Integer.parseInt()
        System.out.println(dx+dxx);

        String dxd = String.valueOf(dx);
        String dxdd = String.valueOf(dxx); // converts integer to string
        System.out.println(dxd+dxdd);


//        String ---> Immutable data type
//        StringBuilder --> Mutable
//        String buffer --> Mutable
    }
}
