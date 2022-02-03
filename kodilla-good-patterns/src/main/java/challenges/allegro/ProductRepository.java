package challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Map<String, Shop> shops = new HashMap<>();

    public ProductRepository() {
        shops.put("computer", new ComputerShop());
    }

    public boolean ifProductExists(String product) {
        return shops.containsKey(product);
    }
}
