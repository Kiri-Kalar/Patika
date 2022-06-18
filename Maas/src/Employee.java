public class Employee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    Employee(String name, double salary, double workHours, double hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000)
            return 0;
        else
            return this.salary*.03;
    }

    public double bonus(){
        if(workHours <= 40)
            return 0;
        else
            return (workHours - 40)*30;
    }

    public double raiseSalary(){
        double yil = 2021 - this.hireYear;
        if(yil < 10)
            return this.salary*.05;
        else if(yil < 20 && yil > 9)
            return this.salary*.1;
        else
            return this.salary*.15;
    }

    public void toMaasString(){ 
        double maasA = this.salary - tax() + bonus();
        double maasB = this.salary + bonus() - tax() + raiseSalary();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + maasA);
        System.out.println("Toplam Maaş : " + maasB);
        System.out.println("---------------------------------------------------");
    }
}