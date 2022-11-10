package tasksAndExercises;

import java.util.Scanner;

public class FasFood {
    public static void main(String[] args) {

        System.out.println("\tMenü ve Fiyat Listesi  ");
        System.out.println("************************");
        String secim=showMainMenu();
        switch (secim){

        }



    }public static String showMainMenu(){
        System.out.println(" 1- Hamburger (45.50TL)");
        System.out.println(" 2- Patates Kizartmasi (11.90TL)");
        System.out.println(" 3- Icecek");
        System.out.println(" 4- Cikis");
        return new Scanner(System.in).nextLine();
    }
}
