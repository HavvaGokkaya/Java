package day05_Ifstatements;

import java.util.Scanner;

public class C01_Ifstatements {
    public static void main(String[] args) {
        //öğrenciden notunun rakam olarak alıp harf olarak yazdırın
        // 0-49,999 FF
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu rakamla giriniz");
        int not = scan.nextInt();

        if (not<=100 && not>=85){
            System.out.println("notunuz : AA");
        }
        if (not<85 && not>=65){
            System.out.println("notunuz : BB");
        }
        if (not<65 && not>=50){
            System.out.println("notunuz : CC");
        }
        if (not<50 && not>=0){
            System.out.println("notunuz : FF");
        }
    }
}
