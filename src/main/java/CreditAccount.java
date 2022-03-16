public class CreditAccount extends Account{  //Кредитный

    public CreditAccount(int balance) {

        super(balance, "Кредитный");
    }

    @Override
    public boolean checkZero (int amount){ //проверка на ноль
        if (balance+amount>0) System.out.println("Операция не возможна, на кредитном счете произойдет переполнение на сумму: " + (balance + amount)+ " рублей");

        return  (balance+amount<=0?true:false);

    }

}
