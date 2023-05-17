package day06;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s="Java is easy";
        String s1=s.toUpperCase();
        System.out.println("s1 = " + s1);
        String s2=s.toLowerCase();
        System.out.println("s2 = " + s2);
        char s3=s.charAt(0);
        System.out.println("s3 = " + s3);
        char s4=s.charAt(1),s5=s.charAt(10);
        System.out.println(""+s4+s5);
        int s6=s.length();
        System.out.println("s6 = " + s6);
        String s7 =s.substring(0,4);
        System.out.println("s7 = " + s7);
        String s8=s.substring(5,7);
        System.out.println("s8 = " + s8);
        String s9=s.substring(8,12);
        System.out.println("s9 = " + s9);
        String s10=s.substring(0);
        System.out.println("s10 = " + s10);
        boolean s11=s.contains("money");
        System.out.println("s11 = " + s11);
        boolean s12=s.contains("easy");
        System.out.println("s12 = " + s12);
        boolean s13=s.startsWith("Java");
        System.out.println("s13 = " + s13);
        boolean s14=s.startsWith("is easy",5);
        System.out.println("s14 = " + s14);
        String a="Learn java earn money";
        boolean a1=a.endsWith("money");
        System.out.println("a1 = " + a1);
        String a2=a.replace("money","dollar");
        System.out.println("a2 = " + a2);
        String a3=a.replace("earn","win");
        System.out.println("a3 = " + a3);
        String a4=a.replace('a','*');
        System.out.println("a4 = " + a4);
        String a5=a.replace("n","xxx");
        System.out.println("a5 = " + a5);
        String a6=a.replace("e","");
        System.out.println("a6 = " + a6);
        String t="Ali 13 yasindadir!...";
        String t1=t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);
        String t2=t.replaceAll("[\\p{Punct}]","?");
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
