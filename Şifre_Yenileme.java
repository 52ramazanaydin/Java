package JavaÖrnekleri;
import java.util.Scanner;

public class Şifre_Yenileme {
    public static void main(String[] args) {

        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        // ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
        // ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
        // "Şifre oluşturuldu" yazan programı yazınız.

        String username = "1", password = "1";
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adini girin : ");
        String username_new = input.nextLine();
        System.out.println("Sifrenizi girin : ");
        String password_new = input.nextLine();
        if (username.equals("1") && password.equals("1"))
        {
            System.out.println("siteye basarili giris yaptiniz ...");
        }
        else {

            System.out.println("Yanlis kullanici adi veya sifre girdiniz . ");
            System.out.println("Sifrenizi degistirmek ister misiniz ? e/h");
            String secim = input.nextLine();
            if (secim == "e") {
                String yeni_password = input.nextLine();
                boolean devam = true;
                while (devam) {
                    if (yeni_password == password_new || yeni_password == password)
                    {
                        System.out.println("Sifreniz degistirilemedi...");
                    }
                    else {
                        System.out.printf("sifreniz degistirildi");
                        devam = false;
                    }
                }

            }
            else {
                System.out.println("Tamamdir");
            }


        }
    }
}