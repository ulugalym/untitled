package day11;

import java.util.Scanner;

public class NestedIfIncrementDecrementTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String gender=input.next();
        System.out.println("Ysinizi giriniz..");
        int age=input.nextInt();
        if(age<0||age>120){
            System.out.println("Lutfan 0-dan buyuk 120-den kucuk olan yaslari giriniz");
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if(age>65){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("kesinlikle calismali");
            }
        }else if(gender.equalsIgnoreCase("kadin")){
            if(age>60){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("kesinlikle okumali");
            }

        }else{
            System.out.println("tanimli degil");
        }
        int a=5; a=a+2;a+=2;a++;a=a*2;a*=2;a=a/2;a/=2;a=a-2;a-=2;a--;a+=6;
        int b=10;b=b+5;b+=5;b++;b=b*2;b*=2;b=b/2;b/=2;b=b-5;b-=5;b--;

        System.out.println(b);
        int c=a--;c=a++;c+=a;
        System.out.println("c="+c);System.out.println("a="+a);
        int s=--a;s=++a;s*=a;
        System.out.println("s="+s);System.out.println("a="+a);
        if (b<10){
            System.out.println("kucuk");
        }else{
            System.out.println("kucuk degil");
        }
        String sonuc=a<10?"kucuk":"kucuk degil";
        System.out.println("sonuc="+sonuc);
        if(a%2==0){
            System.out.println("cift");
        }else{
            System.out.println("tek");
        }
        String sonuc1=b%2==0?"cift":"tek";
        System.out.println("sonuc1 = " + sonuc1);
        int d=0;
        String sonuc2=d>0?"Pozitif":"Negatif";
        System.out.println("sonuc2 = " + sonuc2);
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        int sonuc3=a<b?a:b;
        System.out.println("sonuc3 = " + sonuc3);
    }
}
