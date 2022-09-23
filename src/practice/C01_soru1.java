package practice;

public class C01_soru1 {
    public static void main(String[] args) {

        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] sayi={{1,2,3}, {2,3,1} , {5,5,5,0} , {2,1,3}};
        int min=sayi[0][0];

        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {

                if (sayi[i][j]<min){
                    min=sayi[i][j];
                }
            }

        }
        System.out.println(min);

    }
}
