package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. Kadın : k / Erkek : e");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (yas<18 || yas>90){
            System.out.println("geçersiz yaş");
        } else if (cinsiyet=='k' && yas>=60 ) {
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='k' && yas<60) {
            System.out.println("emekli olmak için "+(60-yas) +" yıl daha çalışmalısınız");
        } else if (cinsiyet=='e' && yas>=65) {
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='e' && yas<65) {
            System.out.println("emekli olmak için "+(65-yas) +" yıl daha çalışmalısınız");
        }
    }
}
