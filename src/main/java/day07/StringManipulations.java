package day07;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfan password'unuzu giriniz...");
        String pwd=input.nextLine();
        boolean first=pwd.length()>7;
        System.out.println("first = " + first);
        boolean second=!pwd.contains(" ");
        System.out.println("second = " + second);
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);
        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);
        boolean fifth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);
        System.out.println("password : "+(first&&second&&third&&fourth&&fifth));
        String s="   Ali Can         ";
        System.out.println("s = " + s);
        String s1=s.trim();
        System.out.println("s1 = " + s1);
        String  tv="$456.99",laptop="$875.99";
        String tv1=tv.replace("$",""),laptop1=laptop.replace("$","");
        double toplam =Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("toplam = " + toplam);
        String name="  ali cAN               ";
        char firstName=name.trim().toUpperCase().charAt(0);
        System.out.println("firstName = " + firstName);
        char lastName=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("lastName = " + lastName);
        System.out.println(""+firstName+lastName);

    }
}
