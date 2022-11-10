package homework;

import java.sql.Array;
import java.util.Arrays;

public class Student {
   public String firstName;
   public String lastName;
   public int age;
   public int[] grade;

    public Student(String firstName, String lastName, int age, int[] grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade=grade;
    }

    public void showInfi(){
        System.out.printf("%s   %s   [%d]  %s",firstName,lastName,age, Arrays.toString(grade));
    }

    public double getGPA(){
        double toplam=0;
        for (int i = 0; i < grade.length; i++) {
            toplam+=grade[i];
        }
        return toplam/grade.length;
    }
   public static void vergleich(double a, double b){
        if (a>b){
            System.out.println("Ahmet daha caliskan");

        }
        else {
            System.out.println("Engin daha caliskan");
        }
    }
}
