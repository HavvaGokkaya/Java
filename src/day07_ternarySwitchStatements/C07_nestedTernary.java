package day07_ternarySwitchStatements;

public class C07_nestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi = -12;

        System.out.println(sayi>0 ?
                            sayi%2==0 ? "çift sayı" : "çift sayı değil":
                            sayi<-99 && sayi>=-999 ? "üç basamaklı" : " üç basamaklı değil");
    }
}
