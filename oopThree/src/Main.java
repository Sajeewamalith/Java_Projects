public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Sajeewa");
        employee.setLastName("Malith");
        employee.setMonthlySalary(-5000);
        System.out.println(employee.getFirstName()+" "+employee.getLastName()+" - "+ employee.getMonthlySalary()+"$");


        EmployeeTest employeeTest = new EmployeeTest("Software Engineer",100000);
        EmployeeTest employeeTest1 = new EmployeeTest("Civil Engineer",50000);
        System.out.println("\n"+employeeTest.getPosition()+" "+employeeTest.yearlySalary);
        employeeTest.newSalary();
        System.out.println(employeeTest1.getPosition()+" "+employeeTest1.getYearlySalary());
        employeeTest1.newSalary();
    }
}