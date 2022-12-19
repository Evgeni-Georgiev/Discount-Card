public interface Consumer {
	Double processDiscount();

	Double processDiscountCalculation();

	Double dueAmountWithDiscount(double currentMonthPurchases);
}
