package day08;

public class StringManipulations01 {
    public static void main(String[] args){
        String str="";
        int kac=str.length();
        System.out.println("kac = " + kac);
        boolean result=str.length()==0;
        System.out.println("result = " + result);
        boolean result1=str.isEmpty();
        System.out.println("result1 = " + result1);
        String str1="      ";
        int kac1=str1.length();
        System.out.println("kac1 = " + kac1);
        boolean result2=str1.replace(" ","").length()==0;
        System.out.println("result2 = " + result2);
        boolean result3=str1.replace(" ","").isEmpty();
        System.out.println("result3 = " + result3);
        boolean result4=str1.isBlank();
        System.out.println("result4 = " + result4);
        //a,i,e
        String a="Java is easy to learn";
        int a1=a.indexOf('a');
        int i1=a.indexOf('i');
        int e1=a.indexOf('e');
        int toplam=a1+i1+e1;
        System.out.println("toplam = " + toplam);
        String s="Ah Java vah Java sensiz olmuyor Java";
        int java1=s.indexOf("Java");
        System.out.println("java1 = " + java1);
        int java2=s.indexOf("java");
        System.out.println("java2 = " + java2);
        int a2=s.lastIndexOf('a'),i2=s.lastIndexOf('i'),e2=s.lastIndexOf('e');
        int toplam1=a2+i2+e2;
        System.out.println("toplam1 = " + toplam1);
        System.out.println("a2 = " + a2);
        System.out.println("i2 = " + i2);
        System.out.println("e2 = " + e2);
        String mail="abc@gmail.com";
        int basi=mail.indexOf('@')+1;
        int sonu=mail.indexOf('.');
        String companyName=mail.substring(basi,sonu);
        System.out.println("companyName = " + companyName);
        System.out.println("companyname = "+mail.substring(4,9));
        String d="ali Can";
        String f="Ali Can";
        boolean equale=d.equals(f);
        System.out.println("equale = " + equale);
        boolean equale1=d==f;
        System.out.println("equale1 = " + equale1);
        boolean equale2=d.equalsIgnoreCase(f);
        System.out.println("equale2 = " + equale2);
        String g="Tom";
        String h="tom";
        String j=new String("Tom");
        System.out.println((g==h)+"\n"+(g==j)+"\n"+(h==j)+"\n"+(g.equals(h))+"\n"+(g.equals(j))+"\n"+h.equals(j));
        System.out.println((g.equalsIgnoreCase(h))+"\n"+(g.equalsIgnoreCase(j))+"\n"+(h.equalsIgnoreCase(j)));
    }
}
