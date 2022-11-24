public class GoldCard extends Card {
    @Override
    public Double currentPurchaseDiscount() {
        this.cardDiscount = 2.0;
        if(this.sumMonth(this.previousMonthPurchases) > 100) {
            for(double i = 300; i <= this.sumMonth(this.previousMonthPurchases); i+=100) {
                this.cardDiscount = (i/100);
                if(i >= 1000) {
                    break;
                }
            }
        }
        return this.cardDiscount;
    }

}
