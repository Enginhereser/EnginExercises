package OOP;

public class Main2 {
    public static void main(String[] args) {

        Car c1=new Car();
        c1.yearModel=2022;
        c1.color="Blue";
        c1.speed=340;
        c1.showInfo();
        c1.accelerate();
        c1.accelerate();
        System.out.println();

        c1.showInfo();

        c1.brake();
        System.out.println();
        c1.showInfo();



    }
}
