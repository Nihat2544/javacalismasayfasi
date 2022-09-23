package practice;

public class C03_soru3 {

   public static int[][] arr={{1,3,6},{2,8},{5,7,9,14}};
   public static int top=0;
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        ciftSayiMethodu();
        System.out.println(top);

    }
    public static int  ciftSayiMethodu() {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    top +=arr[i][j];
                   // System.out.print("cift :" + arr[i][j]);
                }

            }

        }
        return top;
    }
}
