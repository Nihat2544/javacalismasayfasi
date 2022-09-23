package practice;

import java.util.ArrayList;
import java.util.List;

public class C02_soru {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String[][] sayi={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double top=0;
        double top1=0;
        double top2=0;

        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {

                if (sayi[i][j].contains("$")){
                    String x = sayi[i][j].replace("$","");
                    double y=Double.parseDouble(x);
                    //System.out.println(y*3.2);
                    top1 += y*3.2;
                }else if (sayi[i][j].contains("€")){
                    String z = sayi[i][j].replace("€","");
                    double t=Double.parseDouble(z);
                    //System.out.println(t*4.2);
                    top2 += t*4.2;
                }

            }

        }
        System.out.println(" size kalmis : "+ (top1 + top2));

    }
}
