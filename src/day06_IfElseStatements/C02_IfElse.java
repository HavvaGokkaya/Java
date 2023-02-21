package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikizkenar ise “İkizkenar ucgen” yazdirin, degilse “İkizkenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin üç kenar uzunluğunu giriniz");
        double knr1 = scan.nextDouble();
        double knr2 = scan.nextDouble();
        double knr3 = scan.nextDouble();

        if ((knr1==knr2 && knr1!=knr3) || (knr1==knr3 && knr1!=knr2) || (knr2==knr3 && knr2!=knr1)){
            System.out.println("ikizkenar üçgendir");
        }else {
            System.out.println("ikizkenar üçgen değildir");
        }


    }
}
