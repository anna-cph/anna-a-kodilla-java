package challenges.food2door;

public class ProductOrderService implements OrderService {

    public boolean createOrder(Product product) {
        System.out.println("Ordering a product" + product);
        return true;
    }

}
