public abstract class Account implements СheckZero{

   int balance;
   String name;

    public Account( int balance,String name) {

        this.balance=balance;
        this.name=name;
    }
    
    @Override
    public boolean checkZero (int amount) { //проверка на ноль

      if ((balance-amount)<0) System.out.println("Операция не возможна, на счете - " + this.name + ", не хватает средств: " + (balance - amount));
        return  (balance-amount>=0?true:false);
    }

    public void pay(int amount) {  //заплатить

        if (checkZero(amount)) {
            balance-=amount;

            OutputInfo.lineLine();
            System.out.println("Произведена оплата на сумму " + amount + " рублей, счет - " + this.name);
            OutputInfo.lineLine();

        }else {

            OutputInfo.linePlus();
            System.out.println("Оплата на сумму " + amount + " рублей, счет - " +this.name+ ", не была произведена");
            OutputInfo.linePlus();
        }
    }


    public void  transfer(Account account, int amount) {        //перевод

        if (checkZero(amount) && account.checkZero(amount)) {

            balance-=amount;
            account.balance += amount;

            OutputInfo.lineLine();
            System.out.println("Произведен перевод " + amount + " рублей со счета - " +this.name+ ", на счет - " + account.name);
            OutputInfo.lineLine();

        } else {
            OutputInfo.linePlus();
            System.out.println("Перевод на сумму " + amount + " рублей, счет - " + this.name + ", на счет - " + account.name + ", не был произведен");
            OutputInfo.linePlus();
        }
    }

    public void addMoney(int amount) {  //пополнить
        if (checkZero(amount)) {
            balance+=amount;
            OutputInfo.lineLine();
            System.out.println("Произведено пополнение на сумму " + amount + " рублей, счет - " +this.name);
            OutputInfo.lineLine();
        }else {
            OutputInfo.linePlus();
            System.out.println("Пополнение на сумму " + amount + " рублей, счета - " +this.name+ ", не было произведено");
            OutputInfo.linePlus();
        }

    }
}
