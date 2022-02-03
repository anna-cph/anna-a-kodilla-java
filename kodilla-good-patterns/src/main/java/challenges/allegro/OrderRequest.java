package challenges.allegro;

import challenges.carrental.User;

public class OrderRequest {
    private User user;
    private ProductRepository productRepository;

    public OrderRequest(User user, ProductRepository productRepository) {
        this.user = user;
        this.productRepository = productRepository;
    }

    public User getUser() {
        return user;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
