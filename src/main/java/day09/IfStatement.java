package day09;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Lutfan uc basamakli sayi giriniz..");
        int num=input.nextInt();
        num=Math.abs(num);
        if (num>99&&num<1000){
            System.out.println("Sayi uc basamaklidir!");
        }else{
            System.out.println("Sayi uc basamakli degildir! Lutfan uc basamakli sayi giriniz!");
        }
        //-------------------------------------------------------------------------------------------
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan isim giriniz..");
        String name=scan.next();
        
        char tekrarsis=name.charAt(0);
        int last=name.lastIndexOf(tekrarsis);
        System.out.println("last = " + last);
        if ( name.indexOf(tekrarsis)==name.lastIndexOf(tekrarsis)){
            System.out.println(tekrarsis);
        }
        Scanner sayi = new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz");
        int number=sayi.nextInt();
        if(number%2==0){
            System.out.println("Sayi Ciftdir");
        }else if(number%2!=0){
            System.out.println("Sayi cift cegildir");
        }else {
            System.out.println("Basga tokatmi lazim sana!");
        }
        Scanner men =new Scanner(System.in);
        System.out.println("Lutfan harf giriniz...");
        char harf=men.next().charAt(0);
        if(harf>='A'&&harf<='Z'){
            System.out.println("Harf buyuk harfdir..");
        } else if (harf>='a'&&harf<='z') {
            System.out.println("Harf kucuk harfdir..");
        }else{
            System.out.println("harf degildir..");
        }


    }
}
