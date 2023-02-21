package day09_StringManipulations;

public class C04_endsWith {
    //SORU : kullanicidan bir mail alin
    //- mail @ icermiyorsa “gecersiz mail”
    //- mail @gmail.com icermiyorsa, “mail gmail olmali”
    //- mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var” yazdirin.
    public static void main(String[] args) {

        String mail = "havvabayar@gmail.com";

        if (!mail.contains("@")) System.out.println("geçersiz mail");
        else if (!mail.contains("@gmail.com")) System.out.println("gmail olmalı");
        else if (!mail.endsWith("@gmail.com")) System.out.println("yazım hatası");
    }
}
