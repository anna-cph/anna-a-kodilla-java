package challenges.allegro;

import challenges.carrental.InformationService;
import challenges.carrental.User;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository, final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;

    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getProduct());

        if (isOrdered) {
            orderRepository.order(orderRequest.getProduct());
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        }
        else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }


}
