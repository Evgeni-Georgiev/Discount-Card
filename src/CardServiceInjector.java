import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface CardServiceInjector {
	HashMap<Months, List<Double>> previousMonthPurchases = new HashMap<>();
	List<Double> prevPurch = new ArrayList<>();
	HashMap<Months, List<Double>> currentMonthPurchases = new HashMap<>();
	List<Double> currPurch = new ArrayList<>();

	default Double sumMonth(HashMap<Months, List<Double>> monthPurchases) {
		double monthSum = 0;
		for (List<Double> purchase : monthPurchases.values()) {
			for (Double pur : purchase) {
				monthSum += pur;
			}
		}
		return monthSum;
	}

	Double discountCalculation();

	Double currentPurchaseDiscount();

	Consumer getConsumer();
}
