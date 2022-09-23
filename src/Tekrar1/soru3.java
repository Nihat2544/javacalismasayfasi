package Tekrar1;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //kullanicidan iki tamsayi alip bu sayilarin toplam,fark
        // ve carpimlarini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tam sayi giriniz");
        int num1=8;
        int num2=6;

        System.out.println("iki sayinin toplami :"+ (num1+num2));
        System.out.println("iki sayinin farki :"+ (num1-num2));
        System.out.println("iki sayinin carpimi :"+ (num1*num2));


    }

}
