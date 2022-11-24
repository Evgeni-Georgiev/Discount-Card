
public class SilverCard extends Card {
    @Override
    public Double currentPurchaseDiscount() {
        this.cardDiscount = 2.0;
        if(this.sumMonth(this.previousMonthPurchases) > 300) {
            this.cardDiscount = 3.5;
        }
        return this.cardDiscount;
    }

}
