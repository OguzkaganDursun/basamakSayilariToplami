import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int toplam = 0, sayi;

        //Kullanicidan veriyi alinip, basamak sayilari toplanıyor ve ekrana yazdiriliyor.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        sayi = scan.nextInt();

        while (sayi > 0)
        {
            toplam += (sayi % 10);
            sayi /= 10;
        }

        System.out.println("Girilen Sayinin Rakamlari Toplami : "  + toplam);
    }
}
