package Tekrar1;

import java.util.Scanner;

public class alan {
    // kullanicidan karenin bir kenar uzunlugunu alin ve
    // karenin cevresini ve alanini hesaplayip yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin kenaruzunlugunu giriniz");
        int kenar=4;
        int alan=scan.nextInt();
        System.out.println("karenin alini :"+ (kenar*alan));

    }
}
