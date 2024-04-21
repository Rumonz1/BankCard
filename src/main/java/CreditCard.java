import lombok.Getter;

import java.text.DecimalFormat;

public class CreditCard extends BankCard {
    double creditValue;
    double creditLimit;
public CreditCard(double creditLimit) {
    this.creditLimit = creditLimit;
    creditValue = creditLimit;
    }
    /*

     */
    @Override
    public boolean pay(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Списание основных средств: " + sum +".");
            return true;
        } else if (balance + creditValue >= sum) {
            double residualAmount = sum - balance;
            balance = 0.00;
            creditValue -= residualAmount;
            System.out.println("Списание средств с использованием кредитного лимита: "+ sum +".");
            return true;
        }
        System.out.println("Недостаточно средств.");
        return false;
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return "Баланс кредитной карты: "+new DecimalFormat("#.##").format(getBalance())+". Кредитные средства: "+creditValue +".";
    }

    @Override
    public void topUp(double sum) {
        if (balance >= 0.00 & creditValue == creditLimit) {
            balance += sum;
            System.out.println("Пополнение кредитной карты на сумму: "+ sum +".");
        } else if (balance == 0.00 & creditValue < creditLimit) {
            double amountUpToFullLimit = creditLimit - creditValue;
            double residualAmount = sum - amountUpToFullLimit;
            creditValue += amountUpToFullLimit;
            balance += residualAmount;
            System.out.println("Пополнение кредитной карты с погашением долга("+amountUpToFullLimit+") на сумму: "+ sum+".");
        }
    }
}
