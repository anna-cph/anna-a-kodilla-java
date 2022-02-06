package challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Map<String, Shop> shops = new HashMap<>();

    public ProductRepository() {
        shops.put("apples", new Shop("HealthyShop", 122));
        shops.put("meat", new Shop("ExtraFoodShop", 12));
        shops.put("rice", new Shop("GlutenFreeShop", 67));
    }

    public boolean ifProductExists(String product) {
        return shops.containsKey(product);
    }
}
