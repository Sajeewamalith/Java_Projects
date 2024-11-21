public class Employee {

    String firstName;
    String lastName;
    double monthlySalary;
    Employee(){

    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String nameTwo){
        this.lastName = nameTwo;
    }
    public double getMonthlySalary(){
        if (monthlySalary<0.0){
            monthlySalary = 0.0;
        }
        return monthlySalary;

    }
    public void setMonthlySalary(double salary){
        this.monthlySalary = salary;
    }

}
