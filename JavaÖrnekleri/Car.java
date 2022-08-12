package JavaÖrnekleri;

public class Car {
    String model;
    String color;
    String type;
    int speed;
    int speedLimit = 200;

    void increaseSpeed(int artma) {
        if ((artma + speed) < speedLimit) {
            speed += artma;
            System.out.println("Artirilmis hiziniz : "+speed);
        }

    }

    void decreaseSpeed(int azalma) {
        if ((speed - azalma) > 0)
            speed -= azalma;
        System.out.println("Azaltilmis hiziniz : "+speed);
    }

    void Gosterge() {
        System.out.println(model+" Hiziniz saatte " + speed + " kilometre");
    }
}