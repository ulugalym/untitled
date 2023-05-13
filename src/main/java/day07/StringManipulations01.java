package day07;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfan password'unuzu giriniz...");
        String pwd=input.nextLine();
        System.out.println("pwd = " + pwd);
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
        System.out.println("pwd = " +(first&&second&&third&&fourth&&fifth));
        String s="    Ali Can     ";
        String strim=s.trim();
        System.out.println("strim = " + strim);
        String tv="$456.99",laptop="$875.99";
        System.out.println(laptop + tv);
        String tv1=tv.replace("$",""),laptop1=laptop.replace("$","");
        System.out.println(tv1+laptop1);
        double toplama=Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("toplama = " + toplama);
        String name = "Ali Can";
        char firstName=name.toUpperCase().charAt(0),secondName=name.toUpperCase().split(" ")[1].charAt(0);
        System.out.println("firstName = " + firstName);
        System.out.println("secondName = " + secondName);
        System.out.println("bas harfler = "+firstName+secondName);


    }
}
