package Tekrar1;

public class grupCalismasi {
    public static void main(String[] args) {
        /*'a' ile 'z' arasındaki karakterlerin ascii
        değerlerini yazdıran bir Java programı yazın.
        */

        int input='z';

        for (int i ='a'; i <=input; i++) {
            for (int j = input; j <=i ; j++) {

                System.out.println(i + " : " + j);
            }

        }

    }
}
