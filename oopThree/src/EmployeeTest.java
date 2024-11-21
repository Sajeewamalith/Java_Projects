public class EmployeeTest {

   String position;
   int yearlySalary;
      EmployeeTest(String position,int yearlySalary){
         this.position = position;
         this.yearlySalary = yearlySalary;
      }

      public String getPosition(){
         return position;
      }
      public int getYearlySalary(){
         return yearlySalary;
      }

      public void newSalary(){
         yearlySalary = (int) (yearlySalary*0.1) + yearlySalary;
         System.out.println("new salary :"+yearlySalary);
      }
}
