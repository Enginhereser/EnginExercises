public class Employee {
    public String name;
    public int salary;
    public int workHors;
    public int hireYears;

    public Employee(String name, int salary, int workHors, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHors = workHors;
        this.hireYears = hireYears;
    }
    public int bonus(){
        if (workHors>40){
            int saat=0;
            for (int i = 40; i <= workHors; i++) {
                saat++;
            }
            int total=saat*30;
            return total;
        }
        return 0;
    }
    public double reiseSalary(){
        int curentYers=2022;
        if (curentYers-hireYears<10){
           return salary*5.0/100;
        } else if ((curentYers-hireYears>10) & (curentYers-hireYears<20)) {
            return salary*10.0/100;
        }else {
            return salary*5.0/100;
        }

    }
    public String toString(){
        return "Adi : "+name+"\nUcreti : "+salary+" \nHaftalik Calisma Saati :"+workHors+" \nIse baslangic yili : "+hireYears;
    }
}
