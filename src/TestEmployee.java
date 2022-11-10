public class TestEmployee {
    public static void main(String[] args) {

        Employee cls1=new Employee("Engin",20000,55,2000);
        System.out.println(cls1);
        System.out.println("Tatil ücreti : "+cls1.reiseSalary());
        System.out.println("Bonus : "+cls1.bonus());

        System.out.println("Final maas : "+(cls1.salary+cls1.reiseSalary()+cls1.bonus()));

    }
}
