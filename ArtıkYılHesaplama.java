package JavaÖrnekleri;
import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        //1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        //100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("yil bilgisini girin : ");
        year = input.nextInt();
        if(year>0 && year<901){
            if(year%400==0){
                System.out.println(year+" yili artik yildir...");
            }
            else{
                System.out.println(year+" yili artik yil degildir....");
            }
        }
        else{
            if(year%4==0){
                System.out.println(year+" yili artik yildir...");
            }
            else{
                System.out.println(year+" yili artik yil degildir...");
            }
        }
    }
}