package homework;

public class Main {
    public static void main(String[] args) {
 /*       Student s1=new Student();
        s1.firstName="Ahmet";
        s1.lastName="Dursun";
        s1.age=47;
        s1.grade=new double[]{20,30,40};

        Student s2=new Student();
        s2.firstName="Serhat";
        s2.lastName="Akin";
        s2.age=25;
        s2.grade=new double[]{50,70,90};*/

        Student s1=new Student("Ahmet","Dursun",47,new int[]{50,60,70});
        Student s2=new Student("Engin","Hereser",36,new int[]{75,95,85});


        s1.showInfi();
        System.out.println();
        s2.showInfi();
        System.out.println();

        System.out.println(s1.getGPA());
        System.out.println(s2.getGPA());

        Student.vergleich(s1.getGPA(), s2.getGPA());


    }


}
