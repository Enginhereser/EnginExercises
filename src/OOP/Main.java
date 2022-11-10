package OOP;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="John";
        s1.student_no=12345;
        s1.adresse="Berlin";
        s1.phoneNumber="01795124419";
        Student s2=new Student();
        s2.name="Sam";
        s2.student_no=12346;
        s2.adresse="Frankfurt";
        s2.phoneNumber="01794949200";
        s1.showInfo();
        System.out.println();
        s2.showInfo();
    }
}
