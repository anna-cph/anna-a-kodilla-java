package challenges.food2door;

public class OrderRepositoryImpl implements OrderRepository {
    private ProductRepository productRepository;

    public OrderRepositoryImpl() {
        productRepository = new ProductRepository();
    }

    @Override
    public boolean order(Product product) {
        return productRepository.ifProductExists(product.getName());
    }
}
