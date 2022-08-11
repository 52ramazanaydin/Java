package JavaÖrnekleri;
import java.util.Scanner;
public class Hesap_Makinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi ...");
        Scanner input = new Scanner(System.in);
        boolean durum = true;
        int sayi1 , sayi2 , sonuc;
        while(durum){
            System.out.println("Toplama icin 1 ");
            System.out.println("Cikarma icin 2 ");
            System.out.println("Carpma icin 3 ");
            System.out.println("Bolme icin 4 ");
            System.out.println("Cikis icin 5 ");
            int buton = input.nextInt();

            if(buton == 1){
                System.out.println("toplanacak iki sayi girin :");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1+sayi2;
                System.out.println("Cevap : "+sonuc);
            }
            else if(buton == 2){
                System.out.println("cikarilacak iki sayi girin :");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1-sayi2;
                System.out.println("Cevap : "+sonuc);
            }
            else if(buton == 3){
                System.out.println("Carpilacak iki sayi girin :");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                sonuc = sayi1*sayi2;
                System.out.println("Cevap : "+sonuc);
            }
            else if(buton == 4){
                System.out.println("Bolunecek iki sayi girin :");
                sayi1 = input.nextInt();
                sayi2 = input.nextInt();
                if(sayi2 ==0 ){
                    System.out.println("payda 0 olamaz");
                }
                else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Cevap : " + sonuc);
                }
            }
            else if(buton == 5)
            {
                durum = false;
            }
            else{
                System.out.println("Hatali giris yaptiniz");
            }

        }

    }
}