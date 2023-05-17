package day07;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfan password'unuzu giriniz...");
        String pwd=input.nextLine();
        System.out.println("pwd = " + pwd);
        boolean first=pwd.length()>7;
        System.out.println("first = " + first);
        boolean second=!pwd.contains(" ");
        System.out.println("second = " + second);
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);
        boolean fourth=pwd.replaceAll("[a-z]","").length()>0;
        System.out.println("fourth = " + fourth);
        boolean fifth=pwd.replaceAll("[0-9]","").length()>0;
        System.out.println("fifth = " + fifth);
        System.out.println("password dogrumu?"+(first&&second&&third&&fourth&&fifth));
        String r="    Ali Can     ";
        String r1=r.trim();
        System.out.println("r1 = " + r1);
        String tv="$456.99",laptop="$875.99";
        String tv1=tv.replace("$",""),laptop1=laptop.replace("$","");
        double toplam=Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("toplam = " + toplam);
        String e="ali cAN";
        char e1=e.toUpperCase().charAt(0);
        System.out.println("e1 = " + e1);
        char e2=e.toUpperCase().split(" ")[1].charAt(0);
        System.out.println("e2 = " + e2);
        System.out.println(""+e1+e2);

    }
}
