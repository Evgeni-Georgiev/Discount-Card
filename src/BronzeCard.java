import java.util.HashMap;
import java.util.List;

public class BronzeCard implements CardServiceInjector {
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
		cardDiscount = 0.0;
		if (this.sumMonth(this.previousMonthPurchases) < 100) {
			cardDiscount = 0.0;
		} else if (this.sumMonth(this.previousMonthPurchases) >= 100 && this.sumMonth(this.previousMonthPurchases) <= 300) {
			cardDiscount = 0.01;
		} else if (this.sumMonth(this.previousMonthPurchases) > 300) {
			cardDiscount = 2.5;
		}
		return cardDiscount;
	}

	@Override
	public Consumer getConsumer() {
		return new CardDi(new BronzeCard());
	}

}
