package challenges.allegro;
import challenges.carrental.*;

public class Application {

    public static void main(String[] args) {


        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new OrderRepositoryImpl(), new ProductOrderService());
        orderProcessor.process(orderRequest);



        //ProductRepository productRepository = new ProductRepository();
        //productRepository.ifProductExists("cookie");
}
}

