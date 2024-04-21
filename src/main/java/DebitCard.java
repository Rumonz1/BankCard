import java.text.DecimalFormat;

public class DebitCard extends  BankCard {

    @Override
    public boolean pay(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Списание средств: "+ sum +".");
            return true;
        }
        System.out.println("Недостаточно средств.");
        return false;
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return  "Баланс дебетовой карты: " + new DecimalFormat("#.##").format(getBalance()) +".";
    }
}
