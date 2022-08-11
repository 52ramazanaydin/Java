import java.util.Scanner;
public class Manav_Uygulaması {
    public static void main(String[] args) {

        //Java ile kullanıcıların manavdan almış oldukları ürünlerin
        // kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL  Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL patlican : 5,00 TL

        System.out.println("Manava hosgeldiniz");
        Scanner input = new Scanner(System.in);
        double Armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00;
        System.out.println("Hangi meyve-sebze'den ne kadar almak istiyorsunuz ? ");
        System.out.print("Kac kilo armut istiyorsunuz ? ");
        int armut_kilo =  input.nextInt();
        System.out.print("Kac kilo elma istiyorsunuz ? ");
        int elma_kilo =  input.nextInt();
        System.out.print("Kac kilo domates istiyorsunuz ? ");
        int domates_kilo =  input.nextInt();
        System.out.print("Kac kilo muz istiyorsunuz ? ");
        int muz_kilo =  input.nextInt();
        System.out.print("Kac kilo patlican istiyorsunuz ? ");
        int patlican_kilo =  input.nextInt();
        double toplam = (armut_kilo*Armut) + (elma_kilo* elma) + (domates_kilo*domates) + (muz_kilo*muz) + (patlican_kilo*patlican);
        System.out.println("Toplam borcunuz = "+toplam);

    }
}