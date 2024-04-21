public class Main {
    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();
        debitCard1.topUp(58000);
        System.out.println(debitCard1.getInfoAboutAvailableFunds());
        debitCard1.pay(12000.67);
        System.out.println(debitCard1.getInfoAboutAvailableFunds());
        ///////////////
        DebitCardWithBonus debitCardWithBonus1 = new DebitCardWithBonus();
        debitCardWithBonus1.topUp(77777.77);
        System.out.println(debitCardWithBonus1.getInfoAboutAvailableFunds());
        debitCardWithBonus1.pay(332);
        System.out.println(debitCardWithBonus1.getInfoAboutAvailableFunds());
        ///////////////
        CreditCard creditCard1 = new CreditCard(7000);
        System.out.println(creditCard1.getInfoAboutAvailableFunds());
        creditCard1.topUp( 12500);
        creditCard1.pay(13000);
        System.out.println(creditCard1.getInfoAboutAvailableFunds());
        creditCard1.topUp(3000);
        System.out.println(creditCard1.getInfoAboutAvailableFunds());
        ///////////////
        CreditCardWithCashback creditCardWithCashback1 = new CreditCardWithCashback(11111);
        creditCardWithCashback1.topUp(50000);
        creditCardWithCashback1.pay(37000);
        System.out.println(creditCardWithCashback1.getInfoAboutAvailableFunds());
    }
}
