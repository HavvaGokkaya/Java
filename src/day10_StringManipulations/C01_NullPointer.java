package day10_StringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "    ";
        String str3;
        String str4 = null;

        System.out.println(str1.length()); //0
        System.out.println(str2.length()); //4

        System.out.println(str1.isEmpty()); //true
        System.out.println(str2.isEmpty()); //false

        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank()); //true

        //null bir değer değil işaretçidir (null pointer)
        // null pointer : non primitive bir objenin oluşturulduğunu
        //                ancak bilinçli olarak değer atanmadığını işaretler
        //                str4 ün değeri null'dır cümlesi yanlış
        //                str4 null olarak işaretlenmiştir cümlesi doğru

        //System.out.println(str3.length());
        //System.out.println(str3.concat("Ali Can"));
        //System.out.println(str3.substring(3, 4));
        /*
            Java bir variable'ı oluşturup değer atanmamasına izin verir
            bir variable'ı değer atamadan oluşturabilirsiniz ancak KULLANAMAZSINIZ
            değer atanmayan bir variable'ı kullanmaya kalkarsanız
            java CTE verir

            null pointer ise bu variable'a bir değer atanmadığını
            ve bunun bilinçli bir tercih olduğunu java'ya söyler
            dolayısıyla java kodların çalışmaya devam etmesine izin verir
            ancak değer atanmadığı için method'larla kullanmaya çalışırsanız
            NullPointerException verir
         */

        str4=null;
        //System.out.println(str4.length()); // NullPointerException
        //System.out.println(str4.substring(3, 4)); // NullPointerException

        System.out.println(str4); // null
        System.out.println(str4+"Ali Can"); //nullAli Can
        System.out.println(str4.concat("Ali Can"));
    }
}
