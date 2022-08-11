package Giris;

import java.util.Scanner;
public class DersNotlarınıHesaplama {
    public static void main(String[] args) {

        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
         derslerinin sınav puanlarını kullanıcıdan alan
         ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         Aynı program içerisinde koşullu ifadeler kullanılarak,
         eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
         */
        Scanner inp = new Scanner(System.in);
        int matematik, fizik , kimya, turkce , tarih , muzik;
        System.out.println( "Matematik notunu girin : ");
        matematik = inp.nextInt();

        System.out.println( "Fizik notunu girin : ");
        fizik = inp.nextInt();

        System.out.println( "Kimya notunu girin : ");
        kimya = inp.nextInt();

        System.out.println( "Turkce notunu girin : ");
        turkce = inp.nextInt();

        System.out.println( "Tarih notunu girin : ");
        tarih = inp.nextInt();

        System.out.println( "Müzik notunu girin : ");
        muzik = inp.nextInt();
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik );
        double ortalama = toplam / 6;

        if(ortalama>60){
            System.out.println( "Sinifı geçti");

        }
        else{
            System.out.println("kaldı"+ortalama);
        }
    }
}