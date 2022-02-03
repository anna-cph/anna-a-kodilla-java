package challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService implements OrderService {
    private ProductRepository productRepository;

    public ProductOrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean createOrder(Product product) {
        return productRepository.ifProductExists(product.getName());
    }

}
