package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not<0 || not>100){
            System.out.println("geçersiz not");
        } else if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }
    }
}
