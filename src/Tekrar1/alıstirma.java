package Tekrar1;

import java.util.Scanner;

public class alıstirma {
    public static void main(String[] args) {
       // Girdi olarak bir sayı alan ve çarpım tablosunu
        // 10'a kadar yazdıran bir Java programı yazın .

        Scanner in=new Scanner(System.in);
        System.out.print("Input a number :");
        int num1=8;

        for (int i =0; i<10 ; i++) {
            System.out.println(num1+" x "+ (i+1)+ "="
            +(num1 * (i+1)));

        }
    }
}
