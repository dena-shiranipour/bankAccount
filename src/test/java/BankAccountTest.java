import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

        BankAccount firstBankAccount;

        @BeforeEach
        public void setUp(){
                firstBankAccount = new BankAccount("Dena", "Shiranipour", "14/04/01", "01111",0.00);

        }

        @Test
        public void canReturnFirstName(){
                String result = firstBankAccount.getFirstName();
                assertThat(result).isEqualTo("Dena");
        }
        @Test
        public void canReturnLastName(){
                String result = firstBankAccount.getLastName();
                assertThat(result).isEqualTo("Shiranipour");
        }
        @Test
        public void canReturnDateOfBirth(){
                String result = firstBankAccount.getDateOfBirth();
                assertThat(result).isEqualTo("14/04/01");
        }
        @Test
        public void canReturnAccountNumber(){
                String result = firstBankAccount.getAccountNumber();
                assertThat(result).isEqualTo("01111");
        }
        @Test
        public void canReturnBalance(){
                Double result = firstBankAccount.getBalance();
                assertThat(result).isEqualTo(0.00);
        }


        @Test
        public void testDeposit() {
                //create BankAccount object
                BankAccount account = new BankAccount("Dena", "Shiranipour", "14/04/01", "01111", 0.00);
                //set balance
                account.setBalance(0.00);
                //call the deposit() method with something over '0.0'
                account.deposit(10.00);
                //see if worked and updated
                assertEquals(10.00, account.getBalance());
        }

        @Test
        public void testWithdraw(){
                BankAccount account = new BankAccount("Dena", "Shiranipour", "14/04/01", "01111", 10.00);
                account.withdraw(6.00);
                System.out.println( " Balance after withdrawing is " + account.getBalance());
                assertEquals(4.00, account.getBalance());
        }

}




