package JavaÖrnekleri;
import java.util.Scanner;

public class Çin_Zodyağı_Hesaplama {
    public static void main(String[] args) {
        //Java ile kullanıcıdan doğum tarihinÇin Zodyağı değeri alıp ini hesaplayan program yazınız.
        //Çin Zodyağı nedir?
        //4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        // Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
        // ve yıldızlarla pek bir ilgisi yoktur.
        //Çin Zodyağı nasıl hesaplanır?
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        //Doğum Tarihi %12 = 0 ➜ Maymun
        //Doğum Tarihi %12 = 1 ➜ Horoz
        //Doğum Tarihi %12 = 2 ➜ Köpek
        //Doğum Tarihi %12 = 3 ➜ Domuz
        //Doğum Tarihi %12 = 4 ➜ Fare
        //Doğum Tarihi %12 = 5 ➜ Öküz
        //Doğum Tarihi %12 = 6 ➜ Kaplan
        //Doğum Tarihi %12 = 7 ➜ Tavşan
        //Doğum Tarihi %12 = 8 ➜ Ejderha
        //Doğum Tarihi %12 = 9 ➜ Yılan
        //Doğum Tarihi %12 = 10 ➜ At
        //Doğum Tarihi %12 = 11 ➜ Koyun
        int dogumyili;
        int burc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum yilinizi girin : ");
        dogumyili = inp.nextInt();
        burc = dogumyili %12;
        switch (burc){
            case 0 :
                System.out.println("Kalan 0 , Burcunuz Maymun...");
                break;
            case 1 :
                System.out.println("Kalan 1 , Burcunuz Horoz...");
                break;
            case 2 :
                System.out.println("Kalan 2 , Burcunuz Köpek...");
                break;
            case 3 :
                System.out.println("Kalan 3 , Burcunuz Domuz...");
                break;
            case 4 :
                System.out.println("Kalan 4 , Burcunuz Fare...");
                break;
            case 5 :
                System.out.println("Kalan 5 , Burcunuz Öküz...");
                break;
            case 6 :
                System.out.println("Kalan 6 , Burcunuz Kaplan...");
                break;
            case 7 :
                System.out.println("Kalan 7 , Burcunuz Tavşan...");
                break;
            case 8 :
                System.out.println("Kalan 8 , Burcunuz Ejderha...");
                break;
            case 9 :
                System.out.println("Kalan 9 , Burcunuz Yılan...");
                break;
            case 10 :
                System.out.println("Kalan 10 , Burcunuz At...");
                break;
            case 11 :
                System.out.println("Kalan 11 , Burcunuz Koyun...");
                break;

        }
    }
}