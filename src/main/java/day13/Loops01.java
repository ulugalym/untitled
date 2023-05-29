package day13;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan tekrarlanajak isimi yaziniz...");
        String tekrar=input.nextLine();
        for(int i=1;i<6;i++){
            System.out.println(tekrar);
        }
        for (int i=11;i<15;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=40;i>22;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=18;i<57;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=21;i<181;i++){
            if(i%2==0&&i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Luftan bir cumle giriniz...");
        String soz=input.nextLine();
        for (int i=0;i<soz.length();i++){
            String ch=soz.substring(i,i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }
        System.out.println();
        System.out.println("Lutfan cumle yaziniz..");
        String a=input.nextLine();
        String kutu="";
        for (int i=0;i<a.length();i++){
            String a1=a.substring(i,i+1);
             kutu+=a1;
            if(a1.equalsIgnoreCase("a")){
                break;
            }
            System.out.print(a1);

        }
        System.out.println(kutu);
        String s="Pwd12?Ab";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                continue;
            }
            System.out.print(ch);
        }

    }
}
