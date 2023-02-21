package day05_Ifstatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "Eskenar ucgen" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üçgenin 3 kenar uzunluğunu giriniz");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();

        if (knr1==knr3 && knr1==knr2 && knr1>0) System.out.println("eşkenar üçgen");
        else System.out.println("eşkenar üçgen değildir");
    }
}
