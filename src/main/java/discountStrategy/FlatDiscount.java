package discountStrategy;

public class FlatDiscount implements DiscountStrategy {



    @Override
    public double applyDiscount(Order order) {
        // Assume the flat discount is 20% of the total amount
        return order.getTotalAmount() - (order.getTotalAmount() * 0.2);
    }

}
