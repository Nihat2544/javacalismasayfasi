package Tekrar1;

public class esitlik {
    /*
    Kullanıcıdan dört tamsayı alan ve dördü de eşitse eşit,
    yoksa eşit değil yazdıran bir Java programı yazın. editöre git

Örnek Çıktı :
Birinci sayıyı girin: 25
İkinci sayıyı girin: 37
Üçüncü sayıyı girin: 45
Dördüncü sayıyı girin: 23
Sayılar eşit değil!
     */
    public static void main(String[] args) {
        int sayi1=25;
        int sayi2=37;
        int sayi3=45;
        int sayi4=23;

        if (sayi1==sayi2 && sayi2==sayi3 && sayi3==sayi4){
            System.out.println("sayilar esitmi");
        }else{
            System.out.println("!");
        }
    }
}
