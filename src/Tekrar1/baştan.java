package Tekrar1;

import java.util.Scanner;

public class baştan {
    public static void main(String[] args) {
        // kullaniciya ad, memleket, su anki konum, yas, boy soran bir program olusturun
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // net() only can read the first word
        // nextLine()can read the whole Lin

        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz :");
        String isim=scan.nextLine();


        System.out.println("memleket :");
        String memleket=scan.nextLine();

        System.out.println("konum :");
        String konum=scan.nextLine();

        System.out.println("yas :");
        int yas=scan.nextInt();

        System.out.println("boy :");
        double boy=scan.nextDouble();

        System.out.println("seviyorMu :");
        boolean seviyorMu=scan.nextBoolean();

        System.out.println("isminiz ="+ isim);
        System.out.println("memleket ="+ memleket);
        System.out.println("konum ="+ konum);
        System.out.println("yas ="+ yas);
        System.out.println("boy ="+ boy);
        System.out.println("seviyorMu ="+ seviyorMu);


    }
}
