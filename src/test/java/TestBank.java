import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestBank {


    @BeforeAll
public  void setValue() {
        Account[] accountmentsTest = new Account[]{
                new SavingsAccount(1_100_000),  //  Сберегательный счет
                new CreditAccount(-300_000),  //  Кредитный счет
                new CheckingAccount(900_000) //  Расчетный счет
        };
    }


    @Test
    public void testUpZero() {

        //Assert.assertTrue(accountmentsTest[0] >= 0); ?
        Assertions.assertTrue(setValue.accountmentsTest[0] >= 0);
        Assertions.assertTrue(accountmentsTest[2] >= 0);
    }

    @Test
    public void testDownZero() {

        //Assert.assertTrue(accountmentsTest1[0] >= 0); ?
        Assertions.assertTrue(accountmentsTest[1] <= 0);
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


        // when:


        // then:
        //Assertions.***;
    }

}
