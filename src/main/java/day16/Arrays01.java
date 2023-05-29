package day16;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String depo[]=new String[5];
        System.out.println(Arrays.toString(depo));
        System.out.println(depo);
        depo[0]="Sumeyya";
        depo[1]="Saliha";
        depo[2]="Safiyya";
        depo[3]="Zaytuna";
        depo[4]="Ulugbek";
        System.out.println(Arrays.toString(depo));
        System.out.println(depo[4]);
        for (int i=0;i<depo.length;i++){
            System.out.println(depo[i]+"?");
        }
        String std[]=new String[5];
        std[0]="Omer";
        std[1]="Osman";
        std[2]="Hasan";
        std[3]="Huseyin";
        std[4]="Fatima";
        System.out.println(Arrays.toString(std));
        System.out.println(std[0].length()+std[std.length-1].length());
        int g=0;
        for (int i=0;i<std.length;i++){
            g+=std[i].length();
        }
        System.out.println(g);
        int num=0;
       for (String w:std){
           num+=w.length();
       }
        System.out.println(num);
       int not[]=new int[6];
       not[0]=55;
       not[1]=65;
       not[2]=75;
       not[3]=85;
       not[4]=35;
       not[5]=45;
       int num1=0;
       for(int w:not){
           num1+=w;
       }
        System.out.println(num1/not.length);
       int ages[]=new int[6];
       ages[0]=45;
       ages[1]=55;
       ages[2]=12;
       ages[3]=15;
       ages[4]=34;
       ages[5]=9;
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);
        int min=ages[0];
        int max=ages[0];
        for (int w:ages){
            min=Math.min(min,w);
            max=Math.max(max,w);
        }
        System.out.println(min);
        System.out.println(max);
        String color[]=new String[6];
        color[0]="Red";
        color[1]="Blue";
        color[2]="Orange";
        color[3]="Yellow";
        color[4]="Green";
        color[5]="Brown";
        System.out.println(Arrays.toString(color));
        for(String w:color){
            if(w.equals("Yellow")){
                   break;
            }System.out.println(w);
        }
        for (String w:color){
            if(w.equals("Brown")){
                break;
            }
            System.out.println(w);
        }
        for (String w:color ){
            if (w.equals("Blue")){
                break;
            }
            System.out.println(w);
        }
        for(int w:not){
            if(w==35){
                break;
            }
            System.out.println(w);
        }
        for(String w: std){
            if(w.equals("Fatima")){
                break;
            }
            System.out.println(w);
        }
        for(String w:depo){
            if(w.equals("Ulugbek")){
                System.out.println(w);  break;
            }
            System.out.println(w);
        }
    }
}
