package day09_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        //str "cok" içeriyor mu

        System.out.println(str.contains("cok")); //true

        // kullanıcıdan aldığımız cümlede "cok" ile başlayan ilk kelimeyi yazdırın

        System.out.println(str.indexOf('a')); //1
        System.out.println(str.indexOf("v")); //2
        System.out.println(str.indexOf("cok")); //17

        str.indexOf("a", 5); //13

        //2. o'nun indexini yazın
        // önce ilk o'nun indexini buluruz
        // sonra o index den sonrasında 2. o yu ararız
        //Java ile kodlama cok kolay

        int ilkOindex= str.indexOf("o"); //11
        int ikinciOindex= str.indexOf("o",ilkOindex+1);

        System.out.println(ilkOindex + " " +ikinciOindex);



    }
}
