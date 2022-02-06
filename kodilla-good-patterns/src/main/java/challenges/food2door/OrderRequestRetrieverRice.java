package challenges.food2door;

import challenges.carrental.User;

public class OrderRequestRetrieverRice {
    public OrderRequest retrieve() {
        User user = new User("Hannah", "Gluten");
        Product product = new Product("rice");

        return new OrderRequest(user, product);
    }
}
