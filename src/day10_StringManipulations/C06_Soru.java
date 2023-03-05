package day10_StringManipulations;

public class C06_Soru {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        String sifre= "abc1453";

        /* bu soruda şartları bağımsız if cümlesi ile yapmak
            veya if else ile yapmak mümkündür.

            -eğer if else ile yaparsak ilk hatada hatayı yazdırır
            geriye kalanlara bakmaz
            avantajı ise eğer hata yoksa otomatik olarak başarılı şekilde oluşturuldu diyebilir

            -bağımsız if cümlelerinde tüm hataları bir kerede söyleyebiliriz
            ancak bağımsız if cümleleri kodun geriye kalanı ile ilgilenmediğinden
            başarılı şifre oluşturulduğunu bizim ayrı bir mekanizma ile kontroö etmemiz gerekir

         */

        /*
            sonuçta başarılı şfre oluşturuldu demek için bir kontrol mekanizması
            oluşturmamuız gerekir.
            ya her adımda artıracağımız bir sayaç yapıp, en son 4 oldu ise başarılı deriz
            veya başta verdiğimiz değer olumsuz bir durum olduğunda artırılır,
            en sonda kontrol edip eğer baştaki değeri hala koruyorsa başarılı olmuştur diyebiliriz
         */
        int flag=0;
        //  - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            //ilk harf küçük değilse hata yazdır
            System.out.println("ilk harf küçük harf olmalı");
            flag++;
        }
        //  - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)>='9')){
            //son karakter rakam değilse hata yazdır
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            flag++;
        }
        //  - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("şifrenin uzunluğu en az on karakter olmalı");
            flag++;
        }

        if (flag==0) System.out.println("şifreniz başarıyla kaydedildi");
    }
}
