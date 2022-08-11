package JavaÖrnekleri;
import java.util.Scanner;

public class Sayıları_Büyükten_Küçüğe_Sıralama {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "Büyükten Küçüğe" sıralayan programı yazınız.
        int sayi1 , sayi2 , sayi3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayiyi giriniz : ");
        sayi1 = inp.nextInt();

        System.out.print("2. Sayiyi giriniz : ");
        sayi2 = inp.nextInt();

        System.out.print("3. Sayiyi giriniz :");
        sayi3 = inp.nextInt();

        if((sayi1>sayi2)&& (sayi1>sayi3)){
            if (sayi2>sayi3){
                System.out.println("sayi1 > sayi2> sayi3");
            }
            else{
                System.out.println("sayi1 > sayi3> sayi2");
            }

        }
        else if((sayi2>sayi1)&& (sayi2>sayi3)){
            if(sayi1>sayi3) {
                System.out.println("sayi2 > sayi1> sayi3");
            }
            else{
                System.out.println("sayi2 > sayi3> sayi1");
            }
        }
        else{
            if(sayi1>sayi2){
                System.out.println("sayi3 > sayi1> sayi2");
            }
            else{
                System.out.println("sayi3 > sayi2> sayi1");
            }
        }



    }
}