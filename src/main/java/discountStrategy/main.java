package discountStrategy;

public class main {
    public static void main(String[] args) {
        Order order= new Order(1000);
        FlatDiscount flat = new FlatDiscount();
        EmployeeDiscount employee = new EmployeeDiscount();
        SeasonalDiscount seasonal = new SeasonalDiscount();
        order.setDiscountStrategy(seasonal);
        System.out.println(order.applyDiscount());


    }
}
