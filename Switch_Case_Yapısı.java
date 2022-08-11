package JavaÖrnekleri;
import java.util.Scanner;
public class Switch_Case_Yapısı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim){
            case 1:
                System.out.println("secim sonucu 1");
                break;
            case  2:
                System.out.println("secim sonucu 2 ");
                break;
            case 3:
                System.out.println("secim sonucu 3:");
                break;
            default:
                System.out.println("farkli bir sayi girdiniz .");
                break;
        }
    }
}