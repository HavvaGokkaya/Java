package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, g
        // irilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println("büyük harf");
        }else {
            System.out.println("büyük harf değil");
        }
    }
}
