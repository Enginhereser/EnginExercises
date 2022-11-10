package tasksAndExercises;

import java.sql.Array;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        /*
        Task-2 Aşağıdaki cümleyi split metotu ile 1-for each 2-while kullanarak kelimelere ayıralım;
//        İsim Meslek Yaş başlıkları halinda tablo şeklinde listeleyelim.
//        Çıktı:
//        İsim    Meslek    Yaş
//        Ahmet    Berber    32
//        Arif    Manav    55
//        Selim    Doktor    42

        String str = "Ahmet:Berber;32,Arif:Manav;55,Selim:Doktor;42";
         */
        String str = "Ahmet: Berber; 32, Arif: Manav; 55, Selim: Doktor; 42";
        String[] kelime=str.split(" ");
        System.out.println("Isim     Meslek      Yas");

        for (int i = 0; i < kelime.length; i+=3) {
            for (int j = 1; j < kelime.length ; j+=3) {
                for (int k = 2; k <kelime.length ; k+=3) {
                    if ((j==(i+1)) & (k==(j+1))){
                        System.out.printf("%s\t %s\t %s\n",kelime[i],kelime[j],kelime[k]);
                    }
                }
            }
        }

    }
}
