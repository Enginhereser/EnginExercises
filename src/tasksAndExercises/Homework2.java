package tasksAndExercises;

public class Homework2 {
    public static void main(String[] args) {
        double toplam=0;
        int[] students={56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        for (int s:students
             ) {
            toplam+=s;

        }
        System.out.printf("Ortalama = %5.2f",toplam/students.length);
    }
}
