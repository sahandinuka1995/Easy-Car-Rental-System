package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDTO dto);

    void updateOrder(OrderDTO dto);

    OrderDTO searchOrder(String id);

    void deleteOrder(String id);

    List<OrderDTO> getAllOrders();

    void confirmOrder(String id);
}
