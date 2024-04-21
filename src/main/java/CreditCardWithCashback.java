public class CreditCardWithCashback extends CreditCard{
    public CreditCardWithCashback(double creditLimit) {
        super(creditLimit);
    }
    private double percent = 0.05;

    @Override
    public boolean pay(double sum) {
        if (sum <= balance & sum > 5000.00) {
            balance -= sum;
            double cashback = sum * percent;
            balance = balance + cashback;
            System.out.println("Списание основных средств: " + sum +". Начисление кешбека в размере: "+ cashback +".");
            return true;
        } else if (sum <= balance & sum <= 5000.00) {
            balance -= sum;
            System.out.println("Списание основных средств: " + sum +".");
            return true;
        }else if (balance + creditValue >= sum) {
            double residualAmount = sum - balance;
            balance = 0.00;
            creditValue -= residualAmount;
            System.out.println("Списание средств с использованием кредитного лимита: "+ sum +".");
            return true;
        }
        System.out.println("Недостаточно средств.");
        return false;
    }

}
