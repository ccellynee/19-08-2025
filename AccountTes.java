public class AccountTes {
    public static void main (String[] args) {
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance = 1000;
        sa0001.name = "Jesica";
        sa0001.interestRate = 0.02;

        SavingsAccount sa0002 = new SavingsAccount ();
        sa0002.balance = 2000;
        sa0002.name = "Derana ";
        sa0002.interestRate = 0.03;

        SavingsAccount sa0003 = new SavingsAccount();
        sa0003.balance = 4000;
        sa0003.name = "Saka";
        sa0003.interestRate = 0.01;
        
        sa0001.displayCustomer();
        sa0002.displayCustomer();
        sa0003.displayCustomer();
    
    } 
}
