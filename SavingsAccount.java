public class SavingsAccount {
    public double balance;
    public double interestRate;
    public String name;

    public void displayCustomer() {
        System.out.println("Nama: "+ name);
        System.out.println("Balance: "+ balance);
        System.out.println("interestRate: "+ interestRate);
        System.out.println("Interest Earned: "+ (balance*interestRate));
    }
}
