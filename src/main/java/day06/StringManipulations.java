package day06;

public class StringManipulations {

    public static void main(String[] args) {
        String s = "Java is easy";
        String s1=s.toUpperCase();
        System.out.println("s1 = " + s1);
        String s2=s.toLowerCase();
        System.out.println("s2 = " + s2);
        char s3=s.charAt(0);
        System.out.println("s3 = " + s3);
        char sScecond=s.charAt(1),sLastSecond=s.charAt(10);
        System.out.println("sScecond = " + sScecond);
        System.out.println("sLastSecond = " + sLastSecond);
        System.out.println(""+sScecond+sLastSecond);
        int s4=s.length();
        System.out.println("s4 = " + s4);
        String s5=s.substring(0,12);
        System.out.println("s5 = " + s5);
        String sub=s.substring(5,7);
        System.out.println("sub = " + sub);
        String sub1=s.substring(8,12);
        System.out.println("sub1 = " + sub1);
        String sub2=s.substring(5);
        System.out.println("sub2 = " + sub2);
        boolean s6=s.contains("money");
        System.out.println("s6 = " + s6);
        boolean s67=s.contains("easy");
        System.out.println("s67 = " + s67);
        boolean s8=s.contains("kesik");
        System.out.println("s8 = " + s8);
        boolean s9=s.startsWith("Java");
        System.out.println("s9 = " + s9);
        boolean s10=s.startsWith("is",5);
        System.out.println("s10 = " + s10);
        boolean s11=s.startsWith("easy",8);
        System.out.println("s11 = " + s11);
        String a="Learn Java earn money";
        boolean aEnd=a.endsWith("Java earn money");
        System.out.println("aEnd = " + aEnd);
        String aRep=a.replace("money","dollar");
        System.out.println("aRep = " + aRep);
        String aRep1=a.replace("earn","win");
        System.out.println("aRep1 = " + aRep1);
        String aRap2=a.replace('a','*');
        System.out.println("aRap2 = " + aRap2);
        String aRap3=a.replace("n","xxx");
        System.out.println("aRap3 = " + aRap3);
        String aRep4=a.replace("e","");
        System.out.println("aRep4 = " + aRep4);
        String t="Ali 13 yasindadir!...";
        String t1=t.replaceAll("[\\p{Punct}]","?");
        System.out.println("t1 = " + t1);//"[\\p{Punct}]""[\\p{Punct}]""[\\p{Punct}]"
        String t2=t.replaceAll("[0-9]","*");
        System.out.println("t2 = " + t2);
        String t3=t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t3 = " + t3);
        String t4=t.replaceAll("[aouieAOUIE]","?");
        System.out.println("t4 = " + t4);
        String t5=t.replaceAll("[^a-z]","<>");
        System.out.println("t5 = " + t5);
        String t6=t.replaceAll("[^a-zA-Z]","+");
        System.out.println("t6 = " + t6);
        String t7=t.replaceAll("[^ ]","?");
        System.out.println("t7 = " + t7);
        String t8=t.replaceAll("[^aouieAOUIE]","&");
        System.out.println("t8 = " + t8);

        
    }
}
