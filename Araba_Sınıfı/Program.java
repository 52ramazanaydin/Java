package Araba_Sınıfı;


public class Program {


    public static void main(String args[]) {
        Car audi = new Car();{

            audi.model = "Audi A5";
            audi.color = "Black";
            audi.speed = 50;
            audi.increaseSpeed(60);
            audi.decreaseSpeed(15);
            audi.Gosterge();
            System.out.println("Model = "+audi.model);
            System.out.println("Color = "+audi.color);
            System.out.println("Speed = "+audi.speed);


        }
        Car mercedes = new Car();{
            mercedes.model = "Mercedes CLA";
            mercedes.Gosterge();
            mercedes.increaseSpeed(12);
        }

    }

}

