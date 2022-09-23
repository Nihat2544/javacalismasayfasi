package Tekrar1;

import org.w3c.dom.ls.LSOutput;

public class soru2 {
    public static void main(String[] args) {

        // isim ve soyismi alt alta gelecek sekilde yazdirin

        String isim="Nihat";
        String soyisim="Kızılkula";
        System.out.println("lutfen isim ve soyisim giriniz :"
                + isim+" "+soyisim);
        System.out.println("Isminiz :" + isim);
        System.out.println("Soyisminiz :" + soyisim);

        System.out.println(isim.substring(3,4).toUpperCase());

        // iki sayinin toplamını yazdirin
        int say=3;
        int say2=6;
        System.out.println("iki sayinin toplamı :" + say+say2);

        //bir tamsayi ve bir ondalikli variable olusturun toplamini yazin

        int sayi=5;
        double sa=5.6;
        System.out.println("iki sayinin toplami :" + (sayi+sa));

        // char data turunden bir variable olusturup yazdirin

        char S='a';
        System.out.println("char S :" + S);

        String ASKİM="SENİ COKKK SEVİYORUM, FILIZIMMMMM";
        System.out.println("CANİMM :" + ASKİM);

    }
}
