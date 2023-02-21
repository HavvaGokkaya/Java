package day07_ternarySwitchStatements;

import java.util.Scanner;

public class C02_IfElse {
    /* kullanıcıdan bir tam sayı alın
           sayı negatif ise "negatif sayı"
           sayı rakam ise "girilen sayı rakam"
           sayı iki basamaklı ise "girilen sayı iki basamaklı"
           sayı iki basamaktan büyükse "büyük sayı" yazdırın
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi<0) System.out.println("negatif sayı");
        else if (girilenSayi<10) System.out.println("girilen sayi rakam");
        else if (girilenSayi<100) System.out.println("girilen sayı iki basamaklı");
        else System.out.println("büyük sayı");
    }
}
