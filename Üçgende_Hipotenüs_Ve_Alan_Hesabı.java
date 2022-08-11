package Giris;

import java.util.Scanner;
public class Üçgende_Hipotenüs_Ve_Alan_Hesabı {
    public static void main(String[] args) {

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        System.out.println("Dik kenarlari girin :");
        Scanner input = new Scanner(System.in);
        double dikKenar1 = input.nextDouble();
        double dikKenar2 = input.nextDouble();
        double hipotenus = Math.sqrt(dikKenar1*dikKenar1 + dikKenar2*dikKenar2);
        System.out.println( "Hipotenus = "+hipotenus);
        System.out.println( "*************************");

        System.out.println("Alani hesaplamak icin kenarlari girin .");
        dikKenar1 = input.nextDouble();
        dikKenar2 = input.nextDouble();
        double dikKenar3 = input.nextDouble();
        double cevre = (dikKenar1 + dikKenar2 +dikKenar3)/2;
        double alan = Math.sqrt(cevre *(cevre-dikKenar1)*(cevre-dikKenar2)*(cevre-dikKenar3) );
        System.out.println("alan = "+alan);



    }

}