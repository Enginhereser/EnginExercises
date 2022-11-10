package tasksAndExercises;

public class ForEach {
    public static void main(String[] args) {
        // String[] wordsArray = { "Java ", "is ", "very", "great!" } For each metodu ile java cümlesini yazdırınız.

            String[] wordsArray={ "Java ", "is ", "very ", "great!" };
        for (String cumle:wordsArray) {
            System.out.print(cumle);
        }



        // int[] myList= {2, 4, 6, 8, 10} For each metodu ile her bir elemanın karesini ekranı yazıdırınız.

//        2 sayısının karesi: 4.0
//        4 sayısının karesi: 16.0
        int[] myList= {2, 4, 6, 8, 10};
        for (int kare:myList
             ) {
            System.out.println(kare+"sayisinin karesi= "+Math.pow(kare,2));

        }
    }
}
