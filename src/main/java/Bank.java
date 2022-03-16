public class Bank {

    public static void main(String[] args) {

        Account[] accountments= new Account[]{
                new SavingsAccount(1_111_000),  //  Сберегательный счет
                new CreditAccount(-111_3000),  //  Кредитный счет
                new CheckingAccount(910_000) //  Расчетный счет
        };
        OutputInfo.OutputInfoBalans(accountments);


        

        accountments[0].pay(700); //платим с сбер счета
        accountments[1].pay(400); //платим с кредитного счета
        accountments[2].pay(3000); //платим с кредитного счета

        OutputInfo.OutputInfoBalans(accountments);


        accountments[0].transfer(accountments[1],20000_000);      //перевод со сбер счета на кредитный счет
        accountments[0].transfer(accountments[2],200);      //перевод со сбер счета на расчетный счет

        accountments[1].transfer(accountments[0],11900);     //перевод с кредитного счета на сбер счет
        accountments[1].transfer(accountments[2],200);      //перевод с кредитного счета на расчетный счет

        accountments[2].transfer(accountments[0],7000);      //перевод с расчетного счета на сбер счет
        accountments[2].transfer(accountments[1],198000);      //перевод с расчетного счета на кредитный счет

        OutputInfo.OutputInfoBalans(accountments);

        accountments[0].addMoney(7000);      //пополняем сберегательный счет
        accountments[1].addMoney(40000);      //пополняем кредитный счет
        accountments[2].addMoney(200);      //пополняем расчетный счет


        OutputInfo.OutputInfoBalans(accountments);

    }
}
