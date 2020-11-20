package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.OrderReturnDTO;

import java.util.List;

public interface OrderReturnService {
    void saveOrderReturn(OrderReturnDTO dto);

    void updateOrderReturn(OrderReturnDTO dto);

    OrderReturnDTO searchOrderReturn(String id);

    void deleteCOrderReturn(String id);

    List<OrderReturnDTO> getAllOrderReturns();
}
