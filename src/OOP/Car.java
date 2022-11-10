package OOP;

public class Car {
   //  Write a class named Car that has the following fields:
//    yearModel.
//    color.
//    speed.
//    showInfo. Appropriate show methods should get the values stored in an object's yearModel,color, and speed field.
//    Accelerate. The accelerate method should add 5 to the speed field each time it is called
//    Brake. The brake method should subtract 5 from the sped field each time it is called.

    int yearModel;
    String color;
    int speed;



    void showInfo(){
        System.out.printf("Arabanin Modeli : %d\nArabanin Rengi : %s\nArabanin Hizi : %d",yearModel,color,speed);
    }

    int accelerate(){
        this.speed+=5;
       return this.speed;
    }
    int brake(){
        this.speed-=5;
        return this.speed;
    }
}
