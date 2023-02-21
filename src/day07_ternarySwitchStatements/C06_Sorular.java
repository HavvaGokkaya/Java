package day07_ternarySwitchStatements;

public class C06_Sorular {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        int not = 55;

        System.out.println(not>=50 ? "Sınıfı geçtin" : "Maalesef kaldın");


        //Soru 3- Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char harf = 'e';

        System.out.println(harf>=97 && harf<=122 ? (char)harf-32 : harf);


        //Soru 6- kullanıcıdan bir sayı alın ve mutlak değerini yazdırın

        int input = 5;

        System.out.println(input>=0 ? input : input*(-1));

    }
}
