package day09_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";

        System.out.println(str.length()); //19

        //metnin tam ortasındaki karakter nedir

        System.out.println(str.charAt(str.length()/2)); //n

        //son karakteri yazdırın

        System.out.println(str.charAt(str.length()-1)); //p

        // bir karakteri değil de verilen String in içerdiği bir metin parçasını elde etmek istersek
        //örneğin "ogren" kelimesini yazdıralım

        System.out.println(str.substring(5, 9)); //ogre
        // substring(baş,bitiş) metodunda
        // başlangıç olarak yazılan index dahil(inclusive)
        // bitiş olarak yazılan index hariç (exclusive) dir

        System.out.println(str.substring(5, 10)); //ogren

        //str'dan "Java" kelimesini yazdıralım

        System.out.println(str.substring(0,4)); //Java

        // "kap" yazdıralım

        System.out.println(str.substring(16,19)); //kap
        System.out.println(str.substring(16)); //kap
        System.out.println(str.substring(str.length()-3)); // kap

        // substring kullanarak sadece J harfini yazdirin
        System.out.println(str.substring(0)); // Java ogren, isi kap
        System.out.println(str.substring(0,1)); // J

        // substring kullanarak 9.indexdeki harfi buyuk olarak yazdirin
        System.out.println(str.substring(9, 10).toUpperCase()); // N
        System.out.println(str.toUpperCase().charAt(9)); // N

        // chartAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5)); // hiclik yazdirir yani konsolda bos bir satir olusur

        // System.out.println(str.substring(4,3)); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(25,28)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); // hiclik yazdirir
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException
        System.out.println("=======");

    }
    }

