public class OutputInfo {

    static void OutputInfoBalans (Account accountments[]) {
        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Сберегательный счет: " + accountments[0].balance);
        System.out.println("Кредитный счет: " + accountments[1].balance);
        System.out.println("Расчетный счет: " + accountments[2].balance);
        System.out.println("======================================================================");
        System.out.println();
    }

    static void linePlus () {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    static void lineLine () {
        System.out.println("----------------------------------------------------------------------------");
    }


//    static void lineAddMoney (Account accountments[], int amount) {
//        OutputInfo.linePlus();
//        System.out.println("Пополнение на сумму " + amount + " рублей, счета - " +this.name+ ", не было произведено");
//        OutputInfo.linePlus();
//    }

}




