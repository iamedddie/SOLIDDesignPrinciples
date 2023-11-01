package discountStrategy;

public class EmployeeDiscount implements DiscountStrategy {




    @Override
    public double applyDiscount(Order order) {
        // Assume the employee discount is 15% of the total amount
        return order.getTotalAmount() - (order.getTotalAmount() * 0.15);
    }

}
