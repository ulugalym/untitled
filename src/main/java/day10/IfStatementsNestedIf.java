package day10;

import java.util.Scanner;

public class IfStatementsNestedIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz");
        double sayi=input.nextDouble();
        if(sayi>0){
            System.out.println("Sayi pozitif");
        } else if (sayi<0) {
            System.out.println("Sayi negatif");
        }else{
            System.out.println("Sayi notr");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz..");
        byte gun= scan.nextByte();
        if(gun==1){
            System.out.println("Sunday");
        } else if (gun==2) {
            System.out.println("Monday");
        } else if (gun==3) {
            System.out.println("Tuesday");
        } else if (gun==4) {
            System.out.println("Wednesday");
        } else if (gun==5) {
            System.out.println("Thursday");
        } else if (gun==6) {
            System.out.println("Friday");
        } else if (gun==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Lutfan 1 ile 7 aralik olan gecerli sayi giriniz.");
        }
        Scanner men=new Scanner(System.in);
        System.out.println("Lutfan Ay ismini giriniz");
        String month=men.next();
        if (month.equalsIgnoreCase("Janvary")){
            System.out.println(1);
        } else if (month.equalsIgnoreCase("Febrary")) {
            System.out.println(2);
        }else if (month.equalsIgnoreCase("match")) {
            System.out.println(3);
        }else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        }else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if (month.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else if (month.equalsIgnoreCase("Jule")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("Agustos")) {
            System.out.println(8);
        }else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        }else if (month.equalsIgnoreCase("oktober")) {
            System.out.println(10);
        }else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        }else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else {
            System.out.println("Invalid month name...");
        }
    }
}
