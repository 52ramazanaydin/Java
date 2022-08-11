package Giris;

import java.util.Scanner;
public class KDV_hesaplama {
    public static void main(String[] args) {

        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //
        //(Not : KDV tutarını 18% olarak alın)
        //
        //KDV'siz Fiyat = 10;
        //
        //KDV'li Fiyat = 11.8;
        //
        //KDV tutarı = 1.8;
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        System.out.println( "Kdv'sini hesaplamak istediginiz parayi girin : ");
        Scanner input = new Scanner(System.in);
        int para =   input.nextInt();

        if(para>0 && para < 1000){
            System.out.println("Kdv'siz fiyat "+para );
            int kdvli_para = para+(para*18)/100;
            System.out.println("Kdv'li fiyat "+kdvli_para );
            System.out.println("Kdv tutari "+(kdvli_para-para) );

        }
        else{
            System.out.println("Kdv'siz fiyat "+para );
            int kdvli_para2 = para+(para*8)/100;
            System.out.println("Kdv'li fiyat "+kdvli_para2 );
            System.out.println("Kdv tutari "+(kdvli_para2-para) );
        }
    }

}