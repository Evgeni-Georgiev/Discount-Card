import java.util.HashMap;
import java.util.List;

public class GoldCard implements CardServiceInjector {
	double cardDiscount;

	@Override
	public Double sumMonth(HashMap<Months, List<Double>> monthPurchases) {
		return CardServiceInjector.super.sumMonth(monthPurchases);
	}

	@Override
	public Double discountCalculation() {
		return this.sumMonth(currentMonthPurchases) * (currentPurchaseDiscount() / 100);
	}

	@Override
	public Double currentPurchaseDiscount() {
		cardDiscount = 2.0;
		if (this.sumMonth(this.previousMonthPurchases) > 100) {
			for (double i = 300; i <= this.sumMonth(this.previousMonthPurchases); i += 100) {
				cardDiscount = (i / 100);
				if (i >= 1000) {
					break;
				}
			}
		}
		return cardDiscount;
	}

	@Override
	public Consumer getConsumer() {
		return new CardDi(new GoldCard());
	}

}
