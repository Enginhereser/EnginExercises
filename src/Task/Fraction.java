package Task;

public class Fraction {
    /*
    TASK!!! 🔥 Define a class named Fraction. This class is used to represent the ratio of two integers.
     A fraction consists of two private integers, one for numerator and one for denominator.
      An example fraction is 3/4.
      A valid fraction must not have zero in the denominator.
       Create two constructor(), set(), get() and display() methods.
       It includes an additional method, equals(), that takes another Fraction
as input from user and returns true if the two fractions are the same, or false otherwise.
     */
    public int numarator;
    public int denominator;

    public Fraction(int numarator, int denominator) {
        this.numarator = numarator;
        this.denominator = denominator;
    }
    public Fraction() {
    }
    public int getNumarator() {
        return numarator;
    }
    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if (denominator==0){
            System.out.println("Denominator musst not be zero ");
        }
        while (!(denominator==0)){
            this.denominator = denominator;
            break;
        }
    }
    public boolean equals(int x, int y){
        if ((numarator==x) & (denominator==y)){
            System.out.println("True");
            return true;
        }else {
            System.out.println("false");
            return false;}
    }
    public String toString(){
        return getNumarator()+" / "+getDenominator();
    }
}
