public class CardDi implements Consumer {
	public CardServiceInjector cardInjector;

	// Inject the CardServiceInjector object when the constructor of CardDi gets called,
	// so "cardInjector" can be used inside the methods of this class.
	CardDi(CardServiceInjector cardInjector) {
		this.cardInjector = cardInjector;
	}

	public Double processDiscountCalculation() {
		return this.cardInjector.discountCalculation();
	}

	@Override
	public Double dueAmountWithDiscount(double currentMonthPurchases) {
		return currentMonthPurchases - processDiscountCalculation();
	}

	@Override
	public Double processDiscount() {
		return this.cardInjector.currentPurchaseDiscount();
	}

}
