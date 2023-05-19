package day10;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan uc tane sayi giriniz");
        int a=Math.abs(input.nextInt()),b=Math.abs(input.nextInt()),s=Math.abs(input.nextInt());
        boolean ucgenmi=(a+b>s&&s>Math.abs(a-b))&&(a+s>b&&b>Math.abs(a-s))&&(b+s>a&&a>Math.abs(b-s));
        if(ucgenmi){
            if (a==b&&b==s&&s==a) {
                System.out.println("Eskenar ucgendir");
            }else{
                System.out.println("ucgendir");
            }
        }else{
            System.out.println("Ucgen degildir");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan Ucgenin kenarlari icin uc tane uzunluk giriniz");
        double a1=scan.nextDouble(),b1=scan.nextDouble(),s1=scan.nextDouble();
        boolean ucganmi1=(a1+b1>s1&&s1>Math.abs(a1-b1))&&(a1+s1>b1&&b1>Math.abs(a1-s1))&&(b1+s1>a1&&a1>Math.abs(b1-s1));
        if (ucganmi1){
            if(a1==b1&&b1==s1){
                System.out.println("Eskenar ucgendir");
            } else if (a1==b1||b1==s1) {
                System.out.println("Ikiz kenar ucgendir");
            }else{
                System.out.println("Casit kenar ucgendir");
            }
        }else{
            System.out.println("Ucgen degildir");
        }
        Scanner man=new Scanner(System.in);
        System.out.println("Password'unuzu giriniz..");
        String pwd=man.next();
        char firstPwd=pwd.charAt(0);
        if (firstPwd>='A'&&firstPwd<='Z'){
            if (firstPwd=='A'){
                System.out.println("Password dogru");
            }else{
                System.out.println("Password gecersiz buyuk harf ama A degil");
            }
        }else{
            if (firstPwd=='z'){
                System.out.println("password gecerlidir");
            }else{
                System.out.println("Password gecersizdir kucuk harf ama z degil");
            }
        }
    }

}
