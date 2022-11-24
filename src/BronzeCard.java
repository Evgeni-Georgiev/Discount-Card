public class BronzeCard extends Card {
    @Override
    public Double currentPurchaseDiscount() {
        if(this.sumMonth(this.previousMonthPurchases) < 100) {
            this.cardDiscount = 0.0;
        } else if(this.sumMonth(this.previousMonthPurchases) >= 100 && this.sumMonth(this.previousMonthPurchases) <= 300) {
            this.cardDiscount = 0.01;
        } else if(this.sumMonth(this.previousMonthPurchases) > 300) {
            this.cardDiscount = 2.5;
        }
        return this.cardDiscount;
    }

}
