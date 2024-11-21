public class Main {
    public static void main(String[] args) {

        System.out.println("Bank Accounts");

        BankAccounts bankAccountWithdraw = new BankAccounts("Sajeewa",400);
        System.out.println(bankAccountWithdraw.getOwner() + " - "+bankAccountWithdraw.getBalance());
        bankAccountWithdraw.withdraw();

        BankAccounts bankAccountDeposit = new BankAccounts("Malith",400);
        System.out.println("\n"+bankAccountDeposit.getOwner() + " - "+bankAccountDeposit.getBalance());
        bankAccountDeposit.deposit();

        // One owner and do many activities
        System.out.println("\n"+"Bank Account");

        BankAccount bankAccount = new BankAccount("Wonder Women",1000.00);
        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}