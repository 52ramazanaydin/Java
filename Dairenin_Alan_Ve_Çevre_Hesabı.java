package JavaÖrnekleri;
import java.util.Scanner;
public class Dairenin_Alan_Ve_Çevre_Hesabı {
    public static void main(String[] args) {

        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Alan Formülü : π * r * r;
        //
        //Çevre Formülü : 2 * π * r;
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        System.out.println("Dairenin yari capini girin : ");
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        double yaricap = input.nextDouble();
        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;
        System.out.println("Dairenin alani = "+alan);
        System.out.println("Dairenin cevresi = "+cevre);
        System.out.println("**********************************");
        System.out.println("Daire diliminin alanini hesaplama.... ");
        System.out.print("Dairenin yaricapini girin :");
        yaricap = input.nextDouble();
        System.out.println("Dairenin merkez acisini girin :");
        double MerkezAci = input.nextDouble();
        double Hesaplama = (pi * (yaricap*yaricap)* MerkezAci) / 360;
        System.out.println("Daire diliminin Alani = "+Hesaplama);

    }
}