package day11;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
         int a=10;
         int b=20;
         int r=a<b?a++:++b;
        System.out.println("r = " + r);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan bir sayi giriniz..");
        int sayi= input.nextInt();
        int r1=sayi<0?-1*sayi:sayi;
        System.out.println("r1 = " + r1);
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfan iki sayi giriniz.");
        int s1= scan.nextInt(),s2= scan.nextInt();
        Object r2=(s1>0&&s2>0)||(s1<0&&s2<0)?s1*s2:"Farkli isaretli sayilari carpamiyorum.";
        System.out.println("r2 = " + r2);
        boolean sonuc=(sayi>99&&sayi<1000)||(sayi<-99&&sayi>-1000);
        String r3=sonuc?"Uc basamakli":"Uc basamakli degil";
        System.out.println("r3 = " + r3);
        int d=2005;
        String result=d%100==0?(d%400==0?"Loop":"Loop left"):(d%4==0?"Loop":"Loop left");
        System.out.println("resul = " + result);
        int k=1800;
        String result1 = k%100==0?(k%400==0?"dogru":"yanlis"):(k%4==0?"dogru":"yanlis");
        System.out.println("result1 = " + result1);
        int f=1600;
        String result2=f%100==0?(f%400==0?"evet":"hayir"):(f%4==0?"evet":"hayir");

    }
}
