import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		CardServiceInjector injector = new GoldCard();
		CardServiceInjector injector1 = new SilverCard();
		CardServiceInjector injector2 = new BronzeCard();

		// Creating a List with all the discount cards.
		ArrayList<CardServiceInjector> cards = new ArrayList<>();
		cards.add(injector);
		cards.add(injector1);
		cards.add(injector2);

		for (CardServiceInjector card : cards) {
			Consumer app = card.getConsumer();

			// Previous month bill.
			card.prevPurch.add(20.0);
			card.prevPurch.add(20.0);
			card.prevPurch.add(20.0);
			card.prevPurch.add(100.0);
			card.prevPurch.add(100.0);
			card.prevPurch.add(100.0);
			card.prevPurch.add(100.0);
			card.prevPurch.add(100.0);
			card.previousMonthPurchases.put(Months.PREV, card.prevPurch);

			// Current month bill.
			card.currPurch.add(50.0);
			card.currPurch.add(16.0);
			card.currPurch.add(17.0);
			card.currPurch.add(30.0);
			card.currPurch.add(300.0);
			card.currentMonthPurchases.put(Months.CURRENT, card.currPurch);

			// variables holding the current and previous month bills summation.
			var resultCurrentMonth = card.sumMonth(card.currentMonthPurchases);
			var resultPreviousMonth = card.sumMonth(card.previousMonthPurchases);

			System.out.println("Discount Card: " + card.getClass().getSimpleName());
			System.out.println("Value of purchase: " + resultCurrentMonth);
			System.out.println("Discount from price: " + card.discountCalculation());
			System.out.println("Due amount with discount: " + (app.dueAmountWithDiscount(resultCurrentMonth)));
			System.out.println("The discount is " + app.processDiscount());
			System.out.println("Turnover for the previous month: " + resultPreviousMonth);
			System.out.println("----------------------------------------------------");

		}

	}
}
