package tasksAndExercises;

import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        String choice=showMainMenu().toUpperCase();
        switch (choice){
            case "1":
                String matChoice=showSubMenuMath().toUpperCase();
                if (matChoice.equals("1")){
                    //Faktoriel
                    System.out.println("Lütfen Faktoriel sayinizi giriniz");
                    System.out.println("Sonuc = "+factorial(new Scanner(System.in).nextInt()));
                } else if (matChoice.equals("2")) {
                    //Mutlak deger
                    System.out.print("Mutlak deger sayisini girin");
                    int sayi=new Scanner(System.in).nextInt();
                    System.out.printf("Sonuc = %d",sayi>0?sayi:-sayi);
                    System.out.println();//bosluk koymak icin yazdik
                   // System.out.printf("Sonuc = %d",Math.abs(sayi));


                } else if (matChoice.equals("Q")) {
                    System.out.println("Programdan cikildi");
                    System.exit(0);
                }else {

                }
                break;
            case "2":
                String geoChoice=showSubMenuGeoCounting().toUpperCase();
                switch (geoChoice){
                    case "1":
                        //Dikdortgen
                        System.out.println("Lütfen Dikdortgenin;");
                        System.out.print("Uzun Kenar = ");
                        int uzunKenar=new Scanner(System.in).nextInt();
                        System.out.print("Kisa Kenar = ");
                        int kisaKenar=new Scanner(System.in).nextInt();
                        System.out.printf("Dikdortgenin Alani = %d",dikAlanHesapla(uzunKenar,kisaKenar));
                        System.out.println();
                        System.out.printf("Dikdortgenin Cevresi = %d",dikCevreHesapla(uzunKenar,kisaKenar));

                        break;
                    case "2":
                        System.out.println("Lütfen Karenin;");
                        System.out.print("Kenar : ");
                        int kenar=new Scanner(System.in).nextInt();
                        System.out.printf("Karenin Alani = %d",kareAlan(kenar));
                        System.out.println();
                        System.out.printf("Karenin Cevresi = %d",kareCevre(kenar));
                        //Kare
                        break;
                    case "3":
                        //Daire
                        System.out.println("Lütfen Dairenin;");
                        System.out.print("Yari Capi : ");
                        double r=new Scanner(System.in).nextInt();
                        System.out.printf("Dairenin Yari Capi = %5.2f",daireninAlani(r));
                        System.out.println();
                        System.out.printf("Dairenin Cevresi = %5.2f",daireninCevre(r));
                        break;
                    case "4":
                        System.out.println("Programdan cikildi");
                        System.exit(0);
                        break;
                    default:break;

                }
                break;
            case "Q":
                System.out.println("Programdan cikildi");
                System.exit(0);
                break;
            default:
                System.out.println("Yanlis secim Yaptiniz");

                break;

        }


    }

    private static double daireninCevre(double r) {
        return 2*Math.PI*r;
    }

    public static double daireninAlani(double r) {
        return Math.PI*r*r;
    }

    public static String showMainMenu(){
        System.out.println("\t    Ana Menü  ");
        System.out.println("***************************");
        System.out.println("1- Matematik Islemleri");
        System.out.println("2- Alan ve Cevre Hesaplama");
        System.out.println("Q- Cikis");
        System.out.print("Lütfen seciminizi yapiniz : ");
        return new Scanner(System.in).nextLine();
    }
    public static String showSubMenuMath(){
        System.out.println("Alt Menu | Matematik Islemleri ");
        System.out.println("1- Faktoriyel Hesaplama ");
        System.out.println("2- Mutlak Deger ");
        System.out.println("Q- Cikis ");
        System.out.print("Lütfen seciminizi yapiniz : ");
        return new Scanner(System.in).nextLine();
    }
    public static String showSubMenuGeoCounting(){
        System.out.println("Alt Menu | Alan ve Cevre Hesaplama");
        System.out.println("1- Dikdortgen");
        System.out.println("2- Kare");
        System.out.println("3- Daire");
        System.out.println("Q- Cikis ");
        System.out.print("Lütfen seciminizi yapiniz : ");
        return new Scanner(System.in).nextLine();
    }
    public static int factorial(int value){
        if (value<2)return 1;
        int car=1;
        for (int i = 2; i <=value; i++) {
            car*=i;
            //tekrar
            //tekrar

        }
        return car;
    }
    public static int dikAlanHesapla(int uKenar, int kKenar){
        return uKenar*kKenar;
    }
    public static int dikCevreHesapla(int kKenar, int uKenar){
        return 2*(uKenar+kKenar);
    }
    public static int kareAlan(int kenar){
        return kenar*kenar;
    }
    public static int kareCevre(int kenar){
        return 4*kenar;
    }

}
