package JavaÖrnekleri;
import java.util.Scanner;

public class Uçak_Bileti_Fiyatı_Hesaplama {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın
        // . Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
        // ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        // yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
        // şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        double mesafe , fiyat=0;
        int yolculuktipi , yas;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yasinizi girin : ");
        yas = inp.nextInt();
        if(yas<0){
            System.out.println("Hatali deger girdiniz ...");
        }

        System.out.print("Gideceginiz mesafeyi KM cinsinden girin : ");
        mesafe = inp.nextDouble();
        if(mesafe<0){
            System.out.println("Hatali deger girdiniz...");
        }
        else {
            fiyat = 0.10 * mesafe;
        }
        System.out.print("Yolculuk tipini girin \n1 - Tek yon  , 2-Gidis donus : ");
        yolculuktipi = inp.nextInt();
        if(yolculuktipi<=0 || yolculuktipi>=3){
            System.out.println("Hatali veri girdiniz");
        }
        if(yas<12){
            fiyat /=2.0;
            if(yolculuktipi==2);
            {
                fiyat -= fiyat*0.20;
                fiyat *=2;
                System.out.println("bilet fiyatiniz : "+fiyat);
            }
        }
        else if(yas<64){
            fiyat -= fiyat*0.10;
            if(yolculuktipi==2);
            {
                fiyat -= fiyat*0.20;
                fiyat *=2;
                System.out.println("bilet fiyatiniz : "+fiyat);
            }
        }
        else{
            fiyat -= fiyat*0.3;
            if(yolculuktipi==2);
            {
                fiyat -= fiyat*0.20;
                fiyat *=2;
                System.out.println("bilet fiyatiniz : "+fiyat);
            }
        }


    }
}