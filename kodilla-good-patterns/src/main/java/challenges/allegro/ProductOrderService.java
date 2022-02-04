package challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService implements OrderService {

    public boolean createOrder(Product product) {
        System.out.println("Product" + product);
        return true;
    }

}
