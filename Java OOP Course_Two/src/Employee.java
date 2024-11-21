public class Employee {
    Employeename name;
    int age;
    double salary;
    String location;

    Employee(Employeename name,int age,double salary,String location){
        this.name =name;
        this.age =age;
        this.salary = salary;
        this.location = location;

    }

     void raiseSalary(){
        if (age>25){
            salary = salary +100;
            System.out.println("Employee name is "+name+ " and new Salary is "+salary);
        }else {
            System.out.println("Employee name is "+name+ " and new Salary is "+salary);
        }

    }
}
