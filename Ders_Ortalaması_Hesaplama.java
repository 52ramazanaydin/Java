package JavaÖrnekleri;
import java.util.Scanner;

public class Ders_Ortalaması_Hesaplama {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik     Geçme Notu : 55
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        int matematik_vize , matematik_final , fizik_vize , fizik_final , turkce_vize , turkce_final
                , kimya_vize , kimya_final , muzik_vize , muzik_final ;
        double mat_ort , fiz_ort , tur_ort , kim_ort , muz_ort;
        System.out.println("Derslerin notlarini girin : ");
        Scanner inp = new Scanner(System.in);
        System.out.print("Matemaik vize ");
        matematik_vize = inp.nextInt();
        System.out.println("Matematik final ");
        matematik_final = inp.nextInt();
        if(matematik_vize >= 0 || matematik_final <=100 )
        { mat_ort = matematik_vize * 0.4 + matematik_final * 0.6;
            System.out.println("Matematik notunuz "+mat_ort);}
        else
        { System.out.println("Yanlis not girdiniz ...");  }
        System.out.print("fizik vize ");
        fizik_vize = inp.nextInt();
        System.out.print("fizik final ");
        fizik_final = inp.nextInt();
        if(fizik_vize >= 0 || fizik_final <=100 )
        { fiz_ort = fizik_vize * 0.4 + fizik_final * 0.6;
            System.out.println("fizik notunuz "+fiz_ort);}
        else
        { System.out.println("Yanlis not girdiniz ...");  }
        System.out.print("turkce vize ");
        turkce_vize = inp.nextInt();
        System.out.print("turkce final ");
        turkce_final = inp.nextInt();
        if(turkce_vize >= 0 || turkce_final <=100 )
        { tur_ort = turkce_vize * 0.4 + turkce_final * 0.6;
            System.out.println("turkce notunuz "+tur_ort);}
        else
        { System.out.println("Yanlis not girdiniz ...");  }
        System.out.print("kimya vize ");
        kimya_vize = inp.nextInt();
        System.out.print("kimya final ");
        kimya_final = inp.nextInt();
        if(kimya_vize >= 0 || kimya_final <=100 )
        { kim_ort = kimya_vize * 0.4 + kimya_final * 0.6;
            System.out.println("Kimya notunuz "+kim_ort); }
        else
        { System.out.println("Yanlis not girdiniz ...");  }
        System.out.print("muzik vize ");
        muzik_vize = inp.nextInt();
        System.out.print("muzik final ");
        muzik_final = inp.nextInt();
        if(muzik_vize >= 0 || muzik_final <=100 )
        { muz_ort = muzik_vize * 0.4 + muzik_final * 0.6;
            System.out.println("muzik notunuz "+muz_ort);}
        else
        { System.out.println("Yanlis not girdiniz ...");  }
        
    }
}