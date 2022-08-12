package JavaÖrnekleri;
import java.util.Scanner;

public class Negatif_Deger_Girilene_Kadar_Girilen_Sayılardan_Tek_Sayıları_Toplama {
    public static void main(String[] args) {

        //1- Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        boolean deger = true;
        int sayi =0 , toplam = 0;
        Scanner inp = new Scanner(System.in);

        while(deger){
            System.out.print("Sayilari girin : ");
            sayi = inp.nextInt();
            if(sayi<0){
                System.out.println("Negatif sayi girmeyin .....");
            deger= false;
            }
            else{
                if(sayi%2 != 0) {
                    toplam += sayi;
                }
            }

        }
        System.out.println("toplam"+toplam);

    }
}
