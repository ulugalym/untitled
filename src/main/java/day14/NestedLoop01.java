package day14;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            System.out.println("Week:"+i);
            for (int k=1;k<8;k++){
                System.out.println("Day:"+k);
            }
        }
        for(int i=1;i<4;i++){
            for(int k=1;k<5;k++){
                System.out.print("x");
            }
            System.out.println();
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz...");
        int row=scan.nextInt();
        System.out.println("Sutun (column) sayisini giriniz");
        int column= scan.nextInt();
        for (int i=1;i<row+1;i++){
            for(int k=1;k<column+1;k++){
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println("Sarir sayisini giriniz...");
        int row1= scan.nextInt();
        for(int i=1;i<row1+1;i++){
            for(int k=1;k<i+1;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
