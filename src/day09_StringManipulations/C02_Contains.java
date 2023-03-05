package day09_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str= "Java ogren, mutlu ol";

        //str mutlu içeriyor mu?
        System.out.println(str.contains("mutlu")); //true

        // charSequence : char dizisi


        System.out.println(str.contains("j")); //false
        System.out.println(str.contains("")); //true

        //contains metodu kaç tane olduğuna değil sadece var olup olmadığına bakar

        System.out.println(str.contains("Java") && str.contains("mutlu"));
    }
}
