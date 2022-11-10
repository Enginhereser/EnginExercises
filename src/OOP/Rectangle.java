package OOP;

public class Rectangle {
    //  Write a program to print the area and perimeter of a rectangle having sides of  4 and 8 units by creating
    //    a class named 'Rectangle' without any parameter in its constructor.

    int kisaKenar;
    int uzunKenar;


    void area(){
       int alan=kisaKenar*uzunKenar;
        System.out.println("Dikdörtgenin Alani : "+alan);
    }

    void perimeter(){
        int cevre=2*(kisaKenar+uzunKenar);
        System.out.println("Dikdörtgenin Cevresi : "+cevre);
    }
}
