import lombok.Getter;

import java.text.DecimalFormat;

@Getter
public class DebitCardWithBonus extends DebitCard{
    private final double payBonus;
    private final double topUpBonus;
    public DebitCardWithBonus() {
        this.payBonus = 0.01;
        this.topUpBonus = 0.00005 ;
    }

    @Override
    public void topUp(double sum){
        double extraMoney = sum * topUpBonus;
        String formattedExtraMoney = new DecimalFormat("#.##").format(extraMoney);
        balance += sum + extraMoney;
        System.out.println("Пополнение карты на сумму: "+sum +". Плюс бонусные: "+formattedExtraMoney+".");
    }

    @Override
    public boolean pay(double sum) {
        if (sum <= balance) {
            double bonus = sum * payBonus;
            String formattedBonusValue = new DecimalFormat("#.##").format(bonus);
            balance = (balance - sum) + bonus ;
            System.out.println("Списание средств: "+ sum +". Начисление кешбека в размере: "+ formattedBonusValue +".");
            return true;
        }
        System.out.println("Недостаточно средств.");
        return false;
    }
}
