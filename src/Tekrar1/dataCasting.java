package Tekrar1;

public class dataCasting {
    // double 255.36 sayisinin int'a ve sondarada olusturdugunuz
    // int sayiyi byte'a cevirip yazdirin
    public static void main(String[] args) {

        double myDouble=255.36;
        int myInt=(int)myDouble;
        byte mybyt=(byte)myInt;
        System.out.println(myDouble);
        System.out.println(myInt);
        System.out.println(mybyt);

  }
}
