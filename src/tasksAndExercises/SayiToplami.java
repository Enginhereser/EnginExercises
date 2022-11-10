package tasksAndExercises;

import java.util.Scanner;

public class SayiToplami {
    public static void main(String[] args) {

        int toplam=0;
        int sayi;

        do {
            System.out.println("Lütfen sayi girin");
            sayi=new Scanner(System.in).nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            }
        }while (sayi>0);
        System.out.println("Toplam sayi = "+toplam);
        }


    }

