package Tekrar1;

import java.util.Scanner;

public class alistirma4 {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak "Java ogrenmek123 Cok guzel@"
        Stringini "Java ogrenmek com guzel" sekline getirin.
         */
        String str = "Java ogrenmek123 Cok guzel@";

        System.out.println(str.replace("123","")
                .replace("@", "")
                .toLowerCase());


    }
}




