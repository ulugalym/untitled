package day08;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        String a = "";
        int kac = a.length();
        System.out.println("kac = " + kac);
        boolean barlama = a.length() == 0;
        System.out.println("barlama = " + barlama);
        boolean barlama1 = a.isEmpty();
        System.out.println("barlama1 = " + barlama1);
        String s = "      ";
        boolean barlama3 = s.replace(" ", "").length() == 0;
        System.out.println("barlama3 = " + barlama3);
        boolean barlama4 = s.replace(" ", "").isEmpty();
        System.out.println("barlama4 = " + barlama4);
        boolean barlama5 = s.isBlank();
        System.out.println("barlama5 = " + barlama5);
        // "Java is easy to learn"==>1+5+8==>14      a,i,e
        String g = "Java is easy to learn";
        int g1 = g.indexOf("a"), g2 = g.indexOf('i'), g3 = g.indexOf('e');
        int toplu = g1 + g2 + g3;
        System.out.println("toplu = " + toplu);
        System.out.println("g1 = " + g1);
        //"Ah Java vah Java sensiz olmuyor Java."
        String h = "Ah Java vah Java sensiz olmuyor Java";
        int h1 = h.indexOf("Java");
        System.out.println("h1 = " + h1);
        int h2 = h.indexOf("java");
        System.out.println("h2 = " + h2);
        System.out.println(h1 + h2);
        String b = "Java is easy to learn";//a,e,i son gorunumunin index'i
        int b1 = b.lastIndexOf('a');
        System.out.println("b1 = " + b1);
        int b2 = b.lastIndexOf('e');
        System.out.println("b2 = " + b2);
        int b3 = b.lastIndexOf('i');
        System.out.println("b3 = " + b3);
        int hepsi = b1 + b2 + b3;
        System.out.println("toplam=" + hepsi);
        //abc@gmail.com==>gmail  dinamic code
        String c = "abc@gmail.com";
        int c1 = c.indexOf("@") + 1;
        int c2 = c.indexOf(".");
        String sirketIsmi = c.substring(c1, c2);
        System.out.println("sirketIsmi = " + sirketIsmi);
        System.out.println(c.substring(4, 9));//hard coding
        String j = "Ali Can";
        String k = "ali Can";
        boolean barlav = j.equals(k);
        System.out.println("barlav = " + barlav);
        boolean barlav1 = j.equalsIgnoreCase(k);
        System.out.println("barlav1 = " + barlav1);
        String i = "tom";
        String o = "jerry";
        String v = new String("tom");
        System.out.println(o == v);
        System.out.println(o.equals(i));
        System.out.println(i.equals(v));
        System.out.println(j.equalsIgnoreCase(k));
        String men = "Men 30 yasadim";
        int num = men.replaceAll("[0-9]", "").length();
        System.out.println("num = " + num);
        String num1=men.replaceFirst("[^0-9]","");
        String sehir="dashoguz";
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan keci sayisini giriniz");
        int keci=input.nextInt();
        if(keci>0 && keci<1000){
            System.out.println("keci sayisi:"+keci);
        }




    }
}
