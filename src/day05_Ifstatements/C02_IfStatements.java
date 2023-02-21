package day05_Ifstatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir syaı alıp
        //pozitif ise "pozitif sayı"
        //100 ile 999 arasında ise (sınırlar dahil) "pozitif 3 basamaklı sayı"
        //3 ile bölünebiliyorsa "3'ün katı"
        // birler basamağı 7 ise "mükemmel"
        // seçeneklerinden uygun olanları yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi>0) System.out.println("pozitif sayı");
        if (sayi>=100 && sayi<=999) System.out.println("pozitif 3 basamaklı sayı");
        if (sayi%3==0) System.out.println("sayı 3'ün katı");
        if (sayi%10==7) System.out.println("mükemmel");
    }
}
