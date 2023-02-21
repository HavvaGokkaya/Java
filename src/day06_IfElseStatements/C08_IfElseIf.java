package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet ürün aldınız?");
        int urunAdedi = scan.nextInt();

        System.out.println("Liste fiyatı nedir?");
        int listeFiyat = scan.nextInt();

        System.out.println("müşteri kartınız var mı? E/H");
        char kartBilgisi = scan.next().charAt(0);

        if (kartBilgisi=='e' || kartBilgisi=='E'){
            if (urunAdedi>10){
                System.out.println("%20 indirimli ödenecek tutar : "+urunAdedi*listeFiyat*80/100);
            }else if (urunAdedi<=10 && urunAdedi>0){
                System.out.println("%15 indirimli ödenecek tutar : "+urunAdedi*listeFiyat*85/100);
            }else System.out.println("hatalı ürün adedi bilgisi");

        } else if (kartBilgisi=='h' || kartBilgisi=='H') {
            if (urunAdedi>10){
                System.out.println("%15 indirimli ödenecek tutar : "+urunAdedi*listeFiyat*85/100);
            }else if (urunAdedi<=10 && urunAdedi>0){
                System.out.println("%10 indirimli ödenecek tutar : "+urunAdedi*listeFiyat*90/100);
            }else System.out.println("hatalı ürün adedi bilgisi");
        }else System.out.println("Hatalı kart bilgisi");
    }
}
