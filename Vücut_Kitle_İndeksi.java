package JavaÖrnekleri;
import java.util.Scanner;
public class Vücut_Kitle_İndeksi {
    public static void main(String[] args) {

        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın
        //Kilo (kg) / Boy(m) * Boy(m)
        System.out.println("Vucut kitle indeksi hesaplama ....");
        double boy , kilo , vki ;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu girin = ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu girin = ");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy) ;
        System.out.println("Vucut kitle indeksi'niz = "+vki);
    }
}