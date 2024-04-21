
import lombok.Getter;

import java.text.DecimalFormat;
@Getter
abstract class BankCard {

    protected double balance;

    public BankCard() {
        this.balance = 0.00;
    }

//    public String formattedResult = new DecimalFormat("#.##").format(balance);

    public void topUp(double sum){
        balance += sum;
        System.out.println("Пополнение карты на сумму: "+sum +".");
    }

    public abstract boolean pay(double sum);

    public abstract String getInfoAboutAvailableFunds();

}
