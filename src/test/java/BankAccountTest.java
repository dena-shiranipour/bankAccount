import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

        BankAccount firstBankAccount;  //this is an instanciation // (given)

        @BeforeEach
        public void setUp(){
                firstBankAccount = new BankAccount("Dena", "Shiranipour", "14-04-2001", "01111",0.00);
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
                assertThat(result).isEqualTo("14-04-2001");
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
        public void testDeposit(){
                firstBankAccount.deposit(10);
                assertThat(firstBankAccount.getBalance()).isEqualTo(10);
        }

        @Test
        public void testWithdraw(){
                BankAccount account = new BankAccount("Dena", "Shiranipour", "14-04-2001", "01111", 10.00);
                account.withdraw(6.00);
                System.out.println( " Balance after withdrawing is " + account.getBalance());
                assertEquals(4.00, account.getBalance());
        }


        //more testing for getters and setters:

        @Test
        public  void canGetFirstName(){
                assertThat(firstBankAccount.getFirstName()).isEqualTo("Dena");
        }
        @Test
        public void canSetFirstName(){
                firstBankAccount.setFirstName("Dena");
                assertThat(firstBankAccount.getFirstName()).isEqualTo("Dena");
        }

        @Test
        public  void canGetLastName(){
                assertThat(firstBankAccount.getLastName()).isEqualTo("Shiranipour");
        }
        @Test
        public void canSetLastName(){
                firstBankAccount.setLastName("Shiranipour");
                assertThat(firstBankAccount.getLastName()).isEqualTo("Shiranipour");
        }
        @Test
        public void canGetDateOfBirth(){
                assertThat(firstBankAccount.getDateOfBirth()).isEqualTo("14-04-2001");
        }

        @Test
        public void canSetDateOfBirth(){
                firstBankAccount.setDateOfBirth("14-04-2001");
                assertThat(firstBankAccount.getDateOfBirth()).isEqualTo("14-04-2001");
        }

        @Test
        public void canGetAccountNumber(){
                assertThat(firstBankAccount.getAccountNumber()).isEqualTo("01111");
        }

        @Test
        public void canSetAccountNumber(){
                firstBankAccount.setAccountNumber("01111");
                assertThat(firstBankAccount.getAccountNumber()).isEqualTo("01111");
        }

        @Test
        public void canGetBalance(){
                firstBankAccount.deposit(50);
                assertThat(firstBankAccount.getBalance()).isEqualTo(50);
        }

        @Test
        public void canSetBalance(){
                firstBankAccount.setBalance(100.00);
                assertThat(firstBankAccount.getBalance()).isEqualTo(100.00);
        }

        @Test
        public void canAddInterest(){

                        BankAccount account = new BankAccount("Dena", "Shiranipour", "14-04-2001", "01111", 1000.00);
                        account.addInterest();
                        double expectedBalance = 1000.0 + (1000.0 * 0.04);
                        assertEquals(expectedBalance, account.getBalance());
                }


        }































