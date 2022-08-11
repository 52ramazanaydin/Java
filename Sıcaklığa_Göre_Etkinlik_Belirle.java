package JavaÖrnekleri;
import java.util.Scanner;

public class Sıcaklığa_Göre_Etkinlik_Belirle {
    public static void main(String[] args) {
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int sicaklik;
        System.out.print("sicaklik degerini girin : ");
        Scanner inp = new Scanner(System.in);
        sicaklik = inp.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak yapiniz ...");
        }
        if(sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidiniz  ...");
        }
        if(sicaklik>=15 && sicaklik<=25){
            System.out.println("piknik yapiniz ...");
        }
        if(sicaklik>=25){
            System.out.println("yuzmeye  gidiniz ...");
        }
    }
}