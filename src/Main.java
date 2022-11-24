import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card cardSilver = new SilverCard();
        Card cardGold = new GoldCard();
        Card cardBronze = new BronzeCard();

		ArrayList<Card> cards = new ArrayList<>();
		cards.add(cardSilver);
		cards.add(cardGold);
		cards.add(cardBronze);

		for(var card : cards) {

			card.prevPurchase.add(100.0);
			card.prevPurchase.add(100.0);
			card.prevPurchase.add(100.0);
			card.prevPurchase.add(100.0);
			card.prevPurchase.add(100.0);
			card.previousMonthPurchases.put(Months.PREV, card.prevPurchase);

			card.currPurchase.add(50.0);
			card.currPurchase.add(16.0);
			card.currPurchase.add(17.0);
			card.currPurchase.add(30.0);
			card.currPurchase.add(300.0);
			card.currentMonthPurchases.put(Months.CURRENT, card.currPurchase);

			var resultCurrentMonth = card.sumMonth(card.currentMonthPurchases);
			var resultPreviousMonth = card.sumMonth(card.previousMonthPurchases);

			System.out.println("Discount Card: " + card.className);
			System.out.println("Value of purchase: " + resultCurrentMonth);
			System.out.println("Discount from price: " + card.discountCalculation());
			System.out.println("Due amount with discount: " + (resultCurrentMonth - card.discountCalculation()));
			System.out.println("The discount is " + card.currentPurchaseDiscount());
			System.out.println("Turnover for the previous month: " + resultPreviousMonth);

			System.out.println("----------------------------------------------------");

		}

    }
}
