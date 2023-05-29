package day15;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        int i=5;
         while(i>2){
             System.out.println(i);
             i--;
         }
         int a=5;
         do{
             System.out.println("a"+a);
             a--;
         }while(a>2);
         int s=1;
         while(s<1){
             System.out.println("Sen bir while loop'sin...");
             s++;
         }
         int o=1;
         do{
             System.out.println("Sen bir do-while-loop'sin");
             o++;
         }while(o<1);
         Scanner scan=new Scanner(System.in);

        do{
            System.out.println("Lutfan bir tam sayi giriniz...");
            int d=scan.nextInt();
            if(d>99||d<-99){
                System.out.println("Kazandiniz dewam edin...");
            }else{
                System.out.println("Kaybetdiniz");break;
            }

        }while(true);
        do{
            System.out.println("Bir sayi giriniz...");
            int d=scan.nextInt();
            if((d<100)&&(d>-100)){
                System.out.println("kazandin dewam ediniz...");
            }else{
                System.out.println("Kaybetdin");break;
            }
        }while(true);

        int l=0;
        do {
            System.out.println("Lutfan username giriniz...");
            String userName=scan.next();
            System.out.println("Lutfan password giriniz");
            String pwd=scan.next();
            if ( userName.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("Hesabiniza hosh geldiniz");
                break;
            } else if (l == 4) {
                System.out.println("Hesabiniz bloke oldu");
                break;
            }
            l++;
        }while(true);
        int tekrar=0;
        do {
            System.out.println("Lutfan uresname giriniz...");
            String username=scan.next();
            System.out.println("password giriniz...");
            String pasword=scan.next();
            if(username.equals("kalkan")&&pasword.equals("batch171")){
                System.out.println("hesabiniza hos eldiniz");break;
            }else if(tekrar==3){
                System.out.println("hesabiniz bloke oldu");break;
            }
            tekrar++;
        }while(true);
        int tekrar1=0;
        do{
            System.out.println("slfjdfgjhrfvvfdggbfkmhgn...");
            String userName= scan.next();
            System.out.println("sdfshabgjrvsgabsghdfhgfhgbrfdg  gtetv .....");
            String pwd=scan.next();
            if(userName.equals("keloglan")&&pwd.equals("kara123")){
                System.out.println("account is true");break;
            } else if (tekrar1==4) {
                System.out.println("Account is blok");break;
            }tekrar1++;
        }while(true);
    }
}
