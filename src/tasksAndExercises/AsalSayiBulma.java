package tasksAndExercises;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayilar=new int[10];
        int count=0;
        System.out.println("Lütfen 10 adet sayi giriniz");
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println((i + 1) + ". sayi : ");
            sayilar[i] = input.nextInt();
            if (asal(sayilar[i])) {
                count++;
            }
        }
        int max=sayilar[0];
        int min=sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if (max<sayilar[i]){
                max=sayilar[i];
            }if (min>sayilar[i]){
                min=sayilar[i];
            }
        }
        System.out.println("asal sayilar toplami : "+count);
        System.out.printf("En buyuk asal sayi : %s\n",max);
        System.out.printf("En kücük asal sayi : %s\n",min);

    }public static boolean asal(int sayi){
            for (int i = 2; i <sayi; i++) {
                if (sayi%i==0){
                    return false;
                }
            }
            return true;
        }
}
