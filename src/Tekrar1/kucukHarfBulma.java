package Tekrar1;

import java.util.Arrays;

public class kucukHarfBulma {
    /*
    Verilen bir dizideki en küçük k elemanı bulan bir Java programı yazın.
    Dizideki öğeler herhangi bir sırada olabilir. editöre git

Beklenen Çıktı:
Orijinal Dizi:
[1, 4, 17, 7, 25, 3, 100]
Söz konusu dizinin en kucuk 3 elemanı:
     */
    public static void main(String[] args) {
        Integer arr[]=new Integer[]{1, 4, 17, 7, 25, 3, 100};
                int k=3;
        System.out.println("Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println(k + " kucuk elemanlar :");
        Arrays.sort(arr);
        for (int i = 0; i <k; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
