public class SavingsAccount extends Account{

    public SavingsAccount(int balance) {

        super(balance, "Сберегательный");
    }

    @Override
    public void pay(int amount){      //заплатить
        OutputInfo.linePlus();
        System.out.println("Сберегательный счет не предусмотрен для проведения оплаты");
        System.out.println("Оплата на сумму " + amount + " рублей, счет - " +this.name+ ", не была произведена");
        OutputInfo.linePlus();

    }


}
