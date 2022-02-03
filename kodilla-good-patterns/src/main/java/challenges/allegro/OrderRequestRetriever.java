package challenges.allegro;

import challenges.carrental.User;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Harry", "Potter");
        ProductRepository productRepository = new ProductRepository();

        return new OrderRequest(user, productRepository);
    }
}
