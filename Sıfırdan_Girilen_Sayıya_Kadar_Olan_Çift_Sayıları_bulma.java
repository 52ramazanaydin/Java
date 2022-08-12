package JavaÖrnekleri;
import java.util.Scanner;

public class Sıfırdan_Girilen_Sayıya_Kadar_Olan_Çift_Sayıları_bulma{
    public static void main(String[] args) {

        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam
        // bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi girin : ");
        sayi = inp.nextInt();
        System.out.println("Cift sayilar...");
        for(int i = 0 ; i<sayi ; i +=2 ){
            System.out.println(i);
        }

        System.out.println("3e ve 4e tam bolunen sayilar...");
        for(int j = 0 ; j<sayi ; j ++ ){
            if((j%3==0) && (j%4==0)){
                System.out.println(j);

            }
        }



    }
}