package day09_StringManipulations;

public class C05_CharAt {
    public static void main(String[] args) {


        String str = "Java güzeldir"; //

        //java'da index 0'dan başlar
        //J==>0. index, r==>12
        // charAt(index) ile istediğimiz index'deki char'a ulaşabiliriz

        //ilk a'yı yazdıralım
        System.out.println(str.charAt(1));

        //sondan 2. harfi yazdıralım
        System.out.println(str.charAt(13 - 2)); //karakter sayısı -2. index

        //sondan 4. karakteri büyük harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(13 - 4));

        //charAt metodu bize char döndürdüğü için toupperCase() çalışmaz
        //string metodlarını charAt ile kullanmak isterseniz
        //charAt den önce kullanmalısınız

        //System.out.println(str.charAt(13));// stringIndexOutOfBoundException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        //        // o index'i bulamayacagi icin hata verir

    }

}
