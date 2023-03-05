package day10_StringManipulations;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        // bu metindeki sayılardan kurtulun
        String str = "Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));


        str = "Ja1va4 56G7uz,z9el-d0ir8";

        /*
            replace() zaten istenen değişikliği verilen özelliğe uyan tüm değerler için yapar

            eğer genellemeyi bütün sayıları, bütün space'leri, bütün özel karakterleri
            gibi genişletmek istersek replace() yerine replaceAll() kullanırız

            Java bu genellemeleri yazabilmemiz için regex(regular expressions) tanımlamıştır

            \\d : bütün digit'ler
         */
        str=str.replaceAll("\\d","");
        System.out.println(str); //Java Guz,zel-dir

        //ozel karakterlerden de kurtulun
        // space de özel karakter olduğundan bu durumda space in yok olması için
        //

        str=str.replace(" ","5");

        str=str.replaceAll("\\W","");

        str=str.replaceAll("5"," ");

        System.out.println(str);


    }
}
