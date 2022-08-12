package JavaÖrnekleri;


import java.util.Scanner;
public class İşlemler_Menüsü {
    static void islem_Goruntule(){
        System.out.println("1- Toplama islemi\n" + "2- cikarma islemi\n" + "3- carpma islemi\n" + " 4- Bolme islemi\n" +
                " 5- uslu Sayi Hesaplama\n"+ " 6- Faktoriyel Hesaplama\n" + " 7- Mod Alma\n" +
                " 8- Dikdortgen Alan\n" + "9- Dikdortgen cevre\n " + "10- Cikis yap");
    }
    static int Toplama(int sayi1 ,int sayi2){
        return sayi1+sayi2;
    }
    static int Cikarma(int sayi1 ,int sayi2){
        return sayi1-sayi2;
    }

    static int Carpma(int sayi1 ,int sayi2){
        return sayi1*sayi2;
    }

    static int Bolme(int sayi1 ,int sayi2){
        int sonuc = 0;
        if(sayi2 != 0)
            return (sayi1/sayi2);
        else
            System.out.println("Sifira bolme hatasi");
        return 0;
    }
    static int Uslu_Sayi(int taban , int ust) {
        int sonuc = 1;
        if (ust == 0)
            return 1;
        else {
            for (int i = 1; i <= ust; i++) {
                sonuc *= taban;
            }
            return sonuc;
        }
    }

    static int faktoriyel(int sayi1){
        if(sayi1==1 || sayi1 == 0 )
            return 1;
        else if (sayi1 == 2)
            return 2;

        return faktoriyel(sayi1)*faktoriyel(sayi1-1);
    }
    static int mod_alma(int sayi1 , int sayi2){
        int sonuc = sayi1%sayi2;
        return sonuc;
    }

    static int diktortgen_alan(int uzun_kenar , int kisa_kenar){
        return uzun_kenar*kisa_kenar;
    }
    static int diktortgen_cevre(int uzun_kenar , int kisa_kenar){
        return 2*(uzun_kenar+kisa_kenar);
    }



    public static void main(String args[]) {
        //Hesap Makinesi
        //1- Toplama İşlemi
        //2- Çıkarma İşlemi
        //3- Çarpma İşlemi
        //4- Bölme işlemi
        //5- Üslü Sayı Hesaplama
        //6- Faktoriyel Hesaplama
        //7- Mod Alma
        //8- Dikdörtgen Alan ve Çevre Hesabı

        System.out.println("Hesap Makinesi'ne Hos geldiniz...");



        boolean kosul = true;
        while(kosul){
            System.out.println("--------********------------------");
            islem_Goruntule();

            System.out.println("Yapmak istediginiz islemi secin");

            int sayi1, sayi2 , secim;
            Scanner inp = new Scanner(System.in);
            secim = inp.nextInt();

            if(secim == 10){
                System.out.println("Cikis yapiliyor..........");
                kosul = false;
                break;
            }
            else if (secim >=11 || secim <= 0){
                System.out.println("Yanlis deger girdiniz ...");

            }


            System.out.print("Ilk sayi girin : ");
            sayi1 = inp.nextInt();

            System.out.print("Ikinci sayi girin : ");
            sayi2 = inp.nextInt();

            if(secim == 1) {
                System.out.println(Toplama(sayi1, sayi2));
            }
            else if(secim == 2) {
                System.out.println( Cikarma(sayi1, sayi2));
            }
            else if(secim == 3){
                System.out.println(Carpma(sayi1 , sayi2));

            }
            else if (secim ==4) {
                System.out.println(Bolme(sayi1, sayi2));
            }
            else if (secim == 5){
                System.out.println(Uslu_Sayi(sayi1 , sayi2));
            }
            else if (secim == 6){
                System.out.println(faktoriyel(sayi1));
            }
            else if (secim == 7) {
                System.out.println(mod_alma(sayi1 , sayi2));
            }
            else if (secim == 8){
                System.out.println(diktortgen_alan(sayi1 , sayi2));

            }
            else if (secim == 9){
                System.out.println(diktortgen_cevre(sayi1 , sayi2));
            }


        }
    }

}
