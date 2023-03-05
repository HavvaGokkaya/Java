package day10_StringManipulations;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Java heyecandır";

        //eğer tüm a ları değil de sadece ilk a yı değiştirmek isterseniz

        System.out.println(str.replaceFirst("a", "A"));

        //ilk harf veya rakamı yıldız yap

        System.out.println(str.replaceFirst("\\w", "*"));
    }
}
