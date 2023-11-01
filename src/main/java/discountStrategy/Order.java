package discountStrategy;

public class Order {
    private double totalAmount;
    DiscountStrategy discountStrategy;



    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double applyDiscount() {

        return discountStrategy.applyDiscount(this);
    }

    // Other methods...
}
