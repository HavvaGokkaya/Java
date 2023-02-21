package day07_ternarySwitchStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_IfElse {
      /* kullanıcıdan bir tam sayı alın
           sayı rakam ise "girilen sayı rakam"
           sayı iki basamaklı ise "girilen sayı iki basamaklı"
           sayı iki basamaktan büyükse "büyük sayı" yazdırın
         */
      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          System.out.println("Lütfen bir sayı giriniz");
          int girilenSayi = scan.nextInt();

          if (girilenSayi>=0 && girilenSayi<10){
              System.out.println("Girilen sayı rakam");
          } else if (girilenSayi<=99) {
              System.out.println("Girilen sayı iki basamaklı");
          } else if (girilenSayi>99) {
              System.out.println("Büyük sayı");
          }
      }
}
