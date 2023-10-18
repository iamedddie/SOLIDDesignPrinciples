package discountStrategy;

public class Order {
    private double totalAmount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double applyFlatDiscount() {
        // Assume the flat discount is 20% of the total amount
        return this.totalAmount - (this.totalAmount * 0.2);
    }

    public double applySeasonalDiscount() {
        // Assume the seasonal discount is 10% of the total amount
        return this.totalAmount - (this.totalAmount * 0.1);
    }

    // Other methods...
}
