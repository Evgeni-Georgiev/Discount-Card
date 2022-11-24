import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Card {
	protected double cardDiscount;
	protected HashMap<Months, List<Double>> previousMonthPurchases = new HashMap<>();
	protected List<Double> prevPurchase = new ArrayList<>();
	protected HashMap<Months, List<Double>> currentMonthPurchases = new HashMap<>();
	protected List<Double> currPurchase = new ArrayList<>();
    protected String className = this.getClass().getSimpleName();

	Double sumMonth(HashMap<Months, List<Double>> monthPurchases) {
		double monthSum = 0;
		for(List<Double> purchase : monthPurchases.values())
		{
			for(Double pur : purchase) {
				monthSum += pur;
			}
		}
		return monthSum;
	}

    Double discountCalculation() {
        return this.sumMonth(this.currentMonthPurchases) * (currentPurchaseDiscount()/100);
    }

    protected abstract Double currentPurchaseDiscount();

}
