public class BankAccounts {
   private String owner;
   private double balance = 1000;

    public double amount;

     BankAccounts(String owner, double amount){
         this.owner = owner;
         this.amount = amount;
     }
    public void withdraw(){
         balance = balance - amount;
         System.out.println("New Balance: "+balance);

    }
    public void deposit(){
        balance = balance + amount;
        System.out.println("New Balance: "+balance);
    }
    public String getOwner(){
         return owner;
    }
    public double getBalance(){
         return balance;
    }


}
