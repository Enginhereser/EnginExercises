package tasksAndExercises;

import java.util.Scanner;

public class NewMathProject {

    public static void main(String[] args) {
        String secim = showMainMenu().toUpperCase();
        switch (secim) {
            case "1":
                String mathSecim = showSubMenuNumber().toUpperCase();
                switch (mathSecim) {
                    case "1":
                        System.out.println("Bir sayı giriniz: ");
                        int primeNum = new Scanner(System.in).nextInt();
                        int sayac = 0;
                        for (int i = 2; i < primeNum; i++) {
                            if (primeNum % i == 0) {
                                sayac++;
                            }
                        }
                        if (sayac == 0) {
                            System.out.println(primeNum + " Asal bir sayidir.");
                        } else {
                            System.out.println(primeNum + " Asal bir sayi degildir.");
                        }
                        break;

                    case "2":
                        System.out.println("Bir sayı giriniz: ");
                        int perfectNum = new Scanner(System.in).nextInt();
                        int toplam = 0;
                        for (int i = 2; i < perfectNum; i++) {
                            if (perfectNum % i == 0) {
                                toplam += i;
                            }
                        }
                        if (toplam / 2 == perfectNum) {
                            System.out.println(perfectNum + " Mukemmel  bir sayidir.");
                        } else {
                            System.out.println(perfectNum + " Mükemmel  sayi degildir.");
                        }
                        break;
                    case "Q":
                        System.out.println("Programda cikis yapildi.");
                        System.exit(0);
                        break;



                }
        }
    }

    public static String showMainMenu() {

        System.out.println("Ana Menü");
        System.out.println("1. Sayı Hesaplama");
        System.out.println("2. Hacim Hesaplama");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();

    }

    public static String showSubMenuNumber() {
        System.out.println("Alt Menü | Sayı işlemleri");
        System.out.println("1. Prime Number");
        System.out.println("2. Perfect Number");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuVolume() {
        System.out.println("Alt Menü | Hacim Hesaplama");
        System.out.println("1. Küp");
        System.out.println("2. Silindir");
        System.out.println("3. Küre");
        System.out.println("Q. Çıkış");
        System.out.println("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }

}

