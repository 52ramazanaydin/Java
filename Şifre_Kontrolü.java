package JavaÖrnekleri;
import java.util.Scanner;

public class Şifre_Kontrolü {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap sifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }

    }
}