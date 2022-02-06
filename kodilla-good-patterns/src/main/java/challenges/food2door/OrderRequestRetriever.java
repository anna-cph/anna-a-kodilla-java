package challenges.food2door;

import challenges.carrental.User;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Harry", "Potter");
        Product product = new Product("computer");

        return new OrderRequest(user, product);
    }
}
