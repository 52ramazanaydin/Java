package JavaÖrnekleri;

public class Palindrom_Sayı {

    public static void main(String args[]) {
        // Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapın
        //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
        //Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

        isPalindrom(123);

    }
    static boolean isPalindrom (int number){
        int yeni_sayi =0;
        System.out.println("sayi = " + number);

        int sayi = number;
        while (number != 0) {

            int son_basamak = number % 10;
            yeni_sayi = (yeni_sayi * 10) + son_basamak;
            number /= 10;

        }
        System.out.println("Yeni sayi = " + yeni_sayi);
        if (yeni_sayi== number){
            System.out.println("sayi Palindromik sayı'dır ");
        }
        else{
            System.out.println("SAyi Palindromik Degildir.");
        }

        return true;
    }

}