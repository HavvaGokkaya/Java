package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);


        if (girilenHarf>='a' && girilenHarf<='z'){
            System.out.println((char)(girilenHarf-32));
        }else {
            System.out.println(girilenHarf);
        }
    }
}
