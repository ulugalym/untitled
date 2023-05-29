package day15;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        int i=3;
        while(i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (int k=3;k<7;k++){
            System.out.print(k+" ");
        }
        System.out.println();
        int l=23;
        while(l>11){
            if(l%2==0){
                System.out.print(l+" ");
            }
            l--;
        }
        System.out.println();
        int o=6;
        while(o<21){
            if(o%2!=0){
                System.out.print(o+" ");
            }o++;
        }
        System.out.println();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a=scan.nextInt();
        int z=1;
        while(z<11){
            System.out.println(a+"*"+z+"="+(a*z));
            z++;
        }
        System.out.println("bir kelime giriniz...");
        String word=scan.next();
        String kutu="";
        int v=0;
        while(v<word.length()){
            kutu+=word.charAt(v)+"*";
            v++;
        }
        System.out.println(kutu);
        String kutu1="";
        int b=0;
        while(b<word.length()){
            kutu1+=word.charAt(b)+"$";
            b++;
        }
        System.out.println(kutu1);
        String kutu2="";
        int c=0;
        while(c<word.length()){
            kutu2+=word.charAt(c)+"...";
            c++;
        }
        System.out.println(kutu2);
        String kutu3="";
        int r=0;
        while(r<word.length()){
            kutu3+=word.charAt(r)+"//\\";r++;
        }
        System.out.println(kutu3);
        String d="kertenkelle";
        String kutu4="";
        int g=0;
        while(g<d.length()){
            char ch=d.charAt(g);
            if(d.indexOf(ch)==d.lastIndexOf(ch)){
                kutu4+=ch;
            }g++;
        }
        System.out.println(kutu4);
        String kutu5="";
        int j=0;
        while(j<d.length()){
            String ch=d.substring(j,j+1);
            if(d.indexOf(ch)==d.lastIndexOf(ch)){
                kutu5+=ch;
            }j++;
        }
        System.out.println(kutu5);

    }
}
