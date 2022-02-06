package challenges.food2door;

import challenges.carrental.User;

public class OrderRequestRetrieverApples {
    public OrderRequest retrieve() {
        User user = new User("Emilia", "Sroka");
        Product product = new Product("apples");

        return new OrderRequest(user, product);
    }
}
