package day09_StringManipulations;

import java.util.Random;

public class C06_Length {
    public static void main(String[] args) {


        String str= "Java her gecen gun daha da guzellesiyor, değil mi?";

        // sondan 3. karakteri yazdırın

        System.out.println(str.charAt(str.length()-3));

        System.out.println(str.length());

        // Rastgele bir karakterini yazdıralım

        Random rnd=new Random(); // rnd değeri için 0 ile 1 arasında rastgele bir değer oluşturur
        int index= rnd.nextInt(str.length()); //str.length den küçük rastgele bir int verir

        System.out.println(str.charAt(index));
    }
}
