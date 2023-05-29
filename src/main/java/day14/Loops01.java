package day14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        String s = "Java";
        String kutu = "";
        for (int i = s.length() - 1; i > -1; i--) {
            String ch = s.substring(i, i + 1);
            kutu += ch;
        }
        System.out.println(kutu);
        String k = "I love you";
        String kutu1 = "";
        for (int i = k.length() - 1; i > -1; i--) {
            char ch = k.charAt(i);
            kutu1 += ch;
        }
        System.out.println(kutu1);
        String s1 = "ey edip adanada pide ye";
        String kutu2 = "";
        for (int i = s1.length() - 1; i > -1; i--) {
            char ch = s1.charAt(i);
            kutu2 += ch;
        }
        System.out.println(kutu2);
        if (s1.equals(kutu2)) {
            System.out.println("Palindrome'dur ");
        } else {
            System.out.println("Palindrome degildir");
        }
        String s3 = "nalan";
        String kutu3 = "";
        for (int i = s3.length() - 1; i > -1; i--) {
            String ch = s3.substring(i, i + 1);
            kutu3 += ch;
        }
        System.out.println(kutu3);
        if (s3.equals(kutu3)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }
        int s2 = 0;
        for (int i = 5; i < 9; i++) {
            s2 += i;
            // System.out.println(s2);
        }
        System.out.println(s2);
        int s4 = 1;
        for (int i = 7; i < 10; i++) {
            s4 *= i;
        }
        System.out.println(s4);
        int s5 = 578;
        int kutu5 = 0;
        for (int i = s5; i > 0; i /= 10) {
            kutu5 += i % 10;
        }
        System.out.println(kutu5);
        int s6 = 456789;
        int kutu6 = 0;
        for (int i = s6; i > 0; i /= 10) {
            kutu6 += i % 10;
        }
        System.out.println(kutu6);
        int s7 = 1234567890;
        int kutu7 = 0;
        for (int i = s7; i > 0; i /= 10) {
            kutu7 += i % 10;
        }
        System.out.println(kutu7);
        Scanner input = new Scanner(System.in);
        System.out.println("lutfan baslangic ve bitis degerini veriniz...");
        int bas = input.nextInt(), bit = input.nextInt();
        if (bas > bit) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olmamali...");
        } else {
            for (int i = bas; i < bit + 1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Lutfan baslangic ve bitis sayilari giriniz");
        int bas1 = input.nextInt(), bit1 = input.nextInt();
        if (bas1 < bit1) {
            System.out.println("Baslangic sayi bitis sayisindan kucuk olmali");
        } else {
            for (int i = bas1; i > bit1 - 1; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("lutfan baslangic ve bitis sayilari giriniz...");
        int bas2 = input.nextInt(), bit2 = input.nextInt();
        if (bas2 > bit2) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olmamali...");
        } else {
            for (int i = bas2; i < bit2 + 1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        for (int i='d'/'d';i<'d'+1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
