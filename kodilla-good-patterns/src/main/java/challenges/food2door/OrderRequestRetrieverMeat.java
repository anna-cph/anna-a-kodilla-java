package challenges.food2door;

import challenges.carrental.User;

public class OrderRequestRetrieverMeat {
    public OrderRequest retrieve() {
        User user = new User("Harry", "Vegan");
        Product product = new Product("meat");

        return new OrderRequest(user, product);
    }
}
