package tasksAndExercises;

public class Continiu {
    public static void main(String[] args) {
        //  Create a program to write the even numbers from 10 to 20, both included, except 16, in 3 different ways:
//
//        - Incrementing 2 in each step (use "continue" to skip 16)
//        - Incrementing 1 in each step (use "continue")
//        - With and endless loop (using "break" & "continue")

        for (int i = 10; ; i++) {
            if ((i==16) | (i%2==1)){
                continue;
            }
            if (i>20){
                break;

            }
            System.out.print(i+" ");
        }
    }
}
