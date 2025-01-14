package gr.aueb.cf.ch13;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "GR12312343", "Alice", "Wonderland", "s12341", 1000.0);

        try {
            account.deposit(900);
            System.out.println("The deposit was successfull");

            account.withdraw(500, "R123");

            account.withdraw(200, "s12341");
            System.out.println( " sucsessfull");

            System.out.println("Balance: " + account.getAccountBalance());

            System.out.println(account.accountToString());

        } catch (Exception e) {
            // expect invalid
            System.out.println(e.getMessage());
        }
    }
}
