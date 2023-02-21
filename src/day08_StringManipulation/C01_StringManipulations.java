package day08_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_StringManipulations {
    //Soru 4- Kullanicidan gunu ismini girmesini isteyin,
    // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
    // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
    // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String girilenGun = scan.next();

        girilenGun=girilenGun.toLowerCase(Locale.ROOT);

        switch(girilenGun){
            case "pazartesi" :
                System.out.println("Şimdi çalışma zamanı, tatile 5 gün var");
                break;
            case "sali" :
                System.out.println("Şimdi çalışma zamanı, tatile 4 gün var");
                break;
            case "carsamba" :
                System.out.println("Şimdi çalışma zamanı, tatile 3 gün var");
                break;
            case "persembe" :
                System.out.println("Şimdi çalışma zamanı, tatile 2 gün var");
                break;
            case "cuma" :
                System.out.println("Şimdi çalışma zamanı, tatile 1 gün var");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("şimdi dinlenme zamanı");
                break;
            default  :
                System.out.println("yanlış gün ismi");
        }
    }
}
