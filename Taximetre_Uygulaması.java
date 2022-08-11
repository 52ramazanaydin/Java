package JavaÖrnekleri;
import java.util.Scanner;
public class Taximetre_Uygulaması {
    public static void main(String[] args)
    {

        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        System.out.println("Taxiye hosgeldiniz .... ");
        System.out.print( "Gitmek istediginiz KM yi girin : ");
        double taxiMetre = 10;
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        taxiMetre += (km*2.20);
        if (taxiMetre<20)
            System.out.println("Taximetre ucreti = 20");
        else {
            System.out.println("Taximetre ucreti = "+taxiMetre);
        }

    }

}