package JavaÖrnekleri;
import java.util.Scanner;

public class Burç_Hesaplama {
    public static void main(String[] args) {
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart
        int dogumGunu , DogumAyi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum gununu girin : ");
        dogumGunu = inp.nextInt();
        System.out.print("Dogum ayinizi girin : " );
        DogumAyi = inp.nextInt();
        if(DogumAyi==1){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Oglak");
            }
            else{
                System.out.println("Burcunuz Kova");
            }
        }
        else if(DogumAyi==2){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Kova");
            }
            else{
                System.out.println("Burcunuz Balık");
            }
        }
        if(DogumAyi==3){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Balık");
            }
            else{
                System.out.println("Burcunuz Koç");
            }
        }
        if(DogumAyi==4){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Koç");
            }
            else{
                System.out.println("Burcunuz Boğa");
            }
        }
        if(DogumAyi==5){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Boğa");
            }
            else{
                System.out.println("Burcunuz İkizler");
            }
        }
        if(DogumAyi==6){
            if(dogumGunu<=21){
                System.out.println("Burcunuz İkizler");
            }
            else{
                System.out.println("Burcunuz Yengeç");
            }
        }if(DogumAyi==7){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Yengeç");
            }
            else{
                System.out.println("Burcunuz Aslan");
            }
        }if(DogumAyi==8){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Aslan");
            }
            else{
                System.out.println("Burcunuz Başak");
            }
        }
        if(DogumAyi==9){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Başak");
            }
            else{
                System.out.println("Burcunuz Terazi");
            }
        }
        if(DogumAyi==10){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Terazi");
            }
            else{
                System.out.println("Burcunuz Akrep");
            }
        }
        if(DogumAyi==11){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Akrep");
            }
            else{
                System.out.println("Burcunuz Yay");
            }
        }
        if(DogumAyi==12){
            if(dogumGunu<=21){
                System.out.println("Burcunuz Yay");
            }
            else{
                System.out.println("Burcunuz Oğlak");
            }
        }
    }
}