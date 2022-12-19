import java.util.HashMap;
import java.util.List;

public class SilverCard implements CardServiceInjector {
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
		if (this.sumMonth(this.previousMonthPurchases) > 300) {
			cardDiscount = 3.5;
		}
		return cardDiscount;
	}

	@Override
	public Consumer getConsumer() {
		return new CardDi(new SilverCard());
	}

}
