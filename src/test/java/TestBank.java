import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestBank {




    @Test
    public void testUpZero() {

        Account[] accountmentsTest = new Account[]{
                new SavingsAccount(1_100_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };
        //Assert.assertTrue(accountmentsTest[0] >= 0); ?
        Assertions.assertTrue(accountmentsTest[1].balance <= 0);
//        Assertions.assertTrue(accountmentsTest[2] >= 0);
    }

    @Test
    public void testDownZero() {
        Account[] accountmentsTest = new Account[]{
                new SavingsAccount(1_000_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };

        //Assert.assertTrue(accountmentsTest1[0] >= 0); ?
        Assertions.assertTrue(accountmentsTest[0].balance >= 0);
        Assertions.assertTrue(accountmentsTest[2].balance >= 0);
    }


    @Test
    public void testSavingsAccountToCheckingAccount_success() {
        // given:
        Account[] accountmentsTest = new Account[]{
                new SavingsAccount(1_000_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };


        Account[] accountmentsResult = new Account[]{
                new SavingsAccount(800_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(1_100_000) //  Расчетный счет
        };

        accountmentsTest[0].transfer(accountmentsTest[2], 200_000);

        assertThat(accountmentsResult[0].balance, Matchers.equalTo(accountmentsTest[0].balance));
        assertThat(accountmentsResult[2].balance, Matchers.equalTo(accountmentsTest[2].balance));

    }

    @Test
    public void testSavingsAccountToCheckingAccount_success2() {
        // given:
        Account[] accountmentsTest = new Account[]{
                new SavingsAccount(1_000_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };


        Account[] accountmentsResult = new Account[]{
                new SavingsAccount(1_000_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };

        accountmentsTest[0].transfer(accountmentsTest[2], 1_200_000);



        Assertions.assertEquals(accountmentsResult[0].balance,accountmentsTest[0].balance);
        Assertions.assertEquals(accountmentsResult[2].balance,accountmentsTest[2].balance);
    }

}
