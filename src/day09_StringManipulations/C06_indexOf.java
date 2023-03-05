package day09_StringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // kullanıcıdan aldığımız cümlede "cok" ile başlayan ilk kelimeyi yazdırın
        // cümlede cok kelimesi geçmiyorsa, cümlede çok ile başlayan kelime yok yazdıralım

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String girilenCumle=scan.nextLine();

        //sınavlarımızda coktan secmeli sorular kullanıyoruz
        //javayı cok seviyoruz
        // bu kadar coklu secenek olur mu

        if (!girilenCumle.contains("cok")){
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else{

            int cokIndexi =girilenCumle.indexOf("cok");
            int boslukIndexi=girilenCumle.indexOf(" ",cokIndexi+1);

            System.out.println(girilenCumle.substring(cokIndexi,boslukIndexi));
        }


    }
}
