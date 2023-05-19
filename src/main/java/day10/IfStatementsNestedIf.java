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
        Scanner age=new Scanner(System.in);
        System.out.println("Lutfan yasinizi giriniz..");
        byte age1=age.nextByte();
        if (age1<0){
            System.out.println("Lutfan gecarli yas giriniz ..");
        } else if (age1<5) {
            System.out.println("Bebek");
        } else if (age1<13) {
            System.out.println("Cocuk");
        } else if (age1<21) {
            System.out.println("Genc");
        } else if (age1<31) {
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis");
        }
        Scanner hafta=new Scanner(System.in);
        System.out.println("Lutfan hafta ismini giriniz");
        String gun1=hafta.next();
        if (gun1.equalsIgnoreCase("Sanday")){
            System.out.println(1);
        } else if (gun1.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (gun1.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        }else if(gun1.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        }else if(gun1.equalsIgnoreCase("thursday")){
            System.out.println(5);
        }else if (gun1.equalsIgnoreCase("Friday")){
            System.out.println(6);
        }else if(gun1.equalsIgnoreCase("Saturday")){
            System.out.println("7");
        }else{
            System.out.println("Lutfan gecerli gun giriniz ");
        }
        Scanner aySayisi=new Scanner(System.in);
        System.out.println("Lutfan ay sayisini giriniz..");
        byte ay= aySayisi.nextByte();
        if (ay<=0||ay>12){
            System.out.println("Lutfan 1 ile 12 araligindaki sayilari giriniz");
        }else{
            if(ay==1){
                System.out.println("Janvary");
            } else if (ay==2) {
                System.out.println("Febrary");
            } else if (ay==3) {
                System.out.println("March");
            } else if (ay==4) {
                System.out.println("April");
            } else if (ay==5) {
                System.out.println("May");
            } else if (ay==6) {
                System.out.println("June");
            } else if (ay==7) {
                System.out.println("Jule");
            } else if (ay==8) {
                System.out.println("August");
            } else if (ay==9) {
                System.out.println("September");
            } else if (ay==10) {
                System.out.println("Oktober");
            } else if (ay==11) {
                System.out.println("November");
            }else{
                System.out.println("December");
            }
        }
        Scanner pwd=new Scanner(System.in);
        System.out.println("Lutfan password'inizi giriniz...");
        String password=pwd.next();
        if (password.equals("pwd123!")){
            System.out.println("Lutfan biraz bekleyin isleminiz gecerli");
        }else{
            System.out.println("Lutfan gecerli bir password giriniz!");
        }
    }
}
