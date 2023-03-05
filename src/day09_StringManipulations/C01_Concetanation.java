package day09_StringManipulations;

public class C01_Concetanation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Candır";

        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.concat(" ").concat(str2));
    }
}
