package discountStrategy;

public class SeasonalDiscount implements DiscountStrategy {


    @Override
    public double applyDiscount(Order order) {
        // Assume the seasonal discount is 15% of the total amount
        return order.getTotalAmount() - (order.getTotalAmount() * 0.15);
    }

}
