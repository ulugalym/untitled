package day12;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfan gun ismini giriniz");
        String day=input.next();
        switch(day.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case"wednesday":
                System.out.println(4);
                break;
            case"thursday":
                System.out.println(5);
                break;
            case"friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("gecersiz gun ismi lutfan dogru gun ismini giriniz..");
        }
        System.out.println("Lutfan gun sayisini giriniz...");
        int day1=input.nextInt();
        switch(day1){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Lutfan 1 dan 7-e kadar olan dogru sayilari giriniz");
        }
        System.out.println("Lutfan ay sayisini giriniz...");
        byte month=input.nextByte();
        switch(month){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("Oktober");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Lutfan gecerli sayi giriniz 1-den 12-e kadar olan...");
        }
        System.out.println("Lutfan iki sayi giriniz");
        double a=input.nextDouble(),b=input.nextDouble();
        System.out.println("/, *, -, +, % su isaretlerden birini giriniz...");
        char c=input.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case'*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case'/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case'%':
                System.out.println(a+"%"+b+"="+(a*b/100));
                break;
            default:
                System.out.println("tanimli degil ...");
        }
        System.out.println("Lutfan ulke ismi giriniz...");
        String cauntry=input.nextLine();
        switch(cauntry.toLowerCase()){
            case"america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case"germany":
                System.out.println("DE");
                break;
            case"Turkey":
                System.out.println("TR");
                break;
            case"india":
                System.out.println("IN");
                break;
            case"peru":
                System.out.println("PE");
                break;
            case"spain":
                System.out.println("ES");
                break;
            case"bulgaria":
                System.out.println("BG");
                break;
            case"albania":
                System.out.println("AL");
                break;
            case"france":
                System.out.println("FR");
            default:
                System.out.println("Tanimlanmamis devlet ismi...");
        }
    }
}
