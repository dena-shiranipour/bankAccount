import java.time.LocalDate;


public class BankAccount {
    // properties
    String firstName;
    String lastName;
    String dateOfBirth;
    String accountNumber;
    Double balance;

    //constructor

    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber, Double balance) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    //behaviours aka methods (getters and setters)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(Double balance){
        this.balance = 0.00;
    }

    public void deposit(double amount) {
        if (amount > 0.00) {
            balance += amount;
            System.out.println("Deposit of £" + amount + " made!");
        }else {
            System.out.println("Please deposit an amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0.00 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl of £" + amount + " made. ");
        } else {
            System.out.println(" Try again by entering an amount over £0.00 ");
        }

    }


    public void addInterest() {
        double interestRate = 4.0; //4% automatically for any amount
        double interestAmount = balance * (interestRate/100);
        balance += interestAmount;
        System.out.println(" With your added interest, you now have " + interestAmount);


    }

}
