package Tekrar1;

import java.util.Scanner;

public class isimSoyisimYazma {
    // kullanicidan ismni ve soyismini isteyip asagidaki gibi yazdirin
    // Isim : Nihat
    // Soyisim :Kızılkula
    // Kursumuza katiliminiz alinmistir,tesekkur ederiz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz :");
        String isim=scan.nextLine().toLowerCase();
        System.out.println("Lutfen soyisminizi giriniz :");
        String soyisim=scan.nextLine();
        System.out.println("Isminiz :" +isim);
        System.out.println("Soyisminiz :" + soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
    }

}
