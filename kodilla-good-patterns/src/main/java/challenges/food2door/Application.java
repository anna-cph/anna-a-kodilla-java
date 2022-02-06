package challenges.food2door;

import challenges.carrental.MailService;

public class Application {

    public static void main(String[] args) {


        OrderRequestRetrieverApples orderRequestRetrieverApples = new OrderRequestRetrieverApples();
        OrderRequest orderRequestApples = orderRequestRetrieverApples.retrieve();

        OrderProcessor orderProcessorApples = new OrderProcessor(
                new MailService(), new OrderRepositoryImpl(), new ProductOrderService());
        orderProcessorApples.process(orderRequestApples);

        OrderRequestRetrieverMeat orderRequestRetrieverMeat = new OrderRequestRetrieverMeat();
        OrderRequest orderRequestMeat = orderRequestRetrieverMeat.retrieve();

        OrderProcessor orderProcessorMeat = new OrderProcessor(
                new MailService(), new OrderRepositoryImpl(), new ProductOrderService());
        orderProcessorMeat.process(orderRequestMeat);

        OrderRequestRetrieverRice orderRequestRetrieverRice = new OrderRequestRetrieverRice();
        OrderRequest orderRequestRice = orderRequestRetrieverRice.retrieve();

        OrderProcessor orderProcessorRice = new OrderProcessor(
                new MailService(), new OrderRepositoryImpl(), new ProductOrderService());
        orderProcessorRice.process(orderRequestRice);


}
}

