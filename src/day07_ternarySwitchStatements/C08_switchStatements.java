package day07_ternarySwitchStatements;

import java.util.Scanner;

public class C08_switchStatements {
    // kullanıcıdan 2 sayı alın
    // ve kullanıcıya istediği işlemi sorun
    // +, -, *, / işaretlerinden hangisini girerse
    // 2 sayı için o işlemi yapın
    //bu işaretlerden birini girmezse
    // "yanlış işlem tercihi" yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tane tam sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("yapmak istediğiniz işlemi seçiniz");
        char islem = scan.next().charAt(0);

        switch(islem){
            case '+' :
                System.out.println("sayıların toplamı : "+sayi1+sayi2);
                break;
            case '-' :
                System.out.println("sayıların farkı : "+(sayi1-sayi2));
                break;
            case '*' :
                System.out.println("sayıların çarpımı : "+sayi1*sayi2);
                break;
            case '/' :
                System.out.println("sayıların bölümü : "+sayi1/sayi2);
                break;
            default  :
                System.out.println("hatalı işlem girişi");

        }
    }
}
