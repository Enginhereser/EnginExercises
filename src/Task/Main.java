package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fraction fraction=new Fraction(5,4);

        System.out.println("Lütfen numarator giriniz");
        Fraction f1=new Fraction();
        f1.setNumarator(new Scanner(System.in).nextInt());
        System.out.println("Lütfen denominator giriniz");
        f1.setDenominator(new Scanner(System.in).nextInt());
        fraction.equals(f1.getNumarator(),f1.getDenominator());
        System.out.println(fraction.toString());
        }

    }

