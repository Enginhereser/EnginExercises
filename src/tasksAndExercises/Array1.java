package tasksAndExercises;

public class Array1 {
    public static void main(String[] args) {
        String[] meals={"Pilav","Lahmacun","Köfte","Salata","Makarna"};
    /*    System.out.println(meals[0]+" "+meals[2]);
        System.out.println(meals[4]);
        System.out.println(meals[meals.length-1]);
        System.out.println();

        for (int i = 0; i < meals.length; i++) {
            System.out.println(meals[i]);
        }
        System.out.println();

        for (String i:meals) {
            System.out.println(i);

        }*/

        meals[3]="Kebap";
        /*System.out.println("Salata yerine = "+meals[3]);
        System.out.println();
        for (String a:meals
             ) {
            System.out.println(a);
        }*/
        for (int i = meals.length-1; i >=0; i--) {
            System.out.println(meals[i]);
        }
    }
}
