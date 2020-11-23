package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.OrderDTO;
import lk.scodelabs.carrent.dto.OrderReturnDTO;
import lk.scodelabs.carrent.entity.OrderReturn;
import lk.scodelabs.carrent.entity.Orders;
import lk.scodelabs.carrent.repo.OrderRepo;
import lk.scodelabs.carrent.repo.OrderReturnRepo;
import lk.scodelabs.carrent.service.OrderReturnService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderReturnServiceImpl implements OrderReturnService {

    @Autowired
    OrderReturnRepo orderReturnRepo;

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveOrderReturn(OrderReturnDTO dto) {
        if (!orderReturnRepo.existsById(dto.getOReturnId())) {
            Optional<Orders> byId = orderRepo.findById(dto.getOrders().getOrderId());
            OrderDTO map = modelMapper.map(byId.get(), OrderDTO.class);
            dto.setOrders(map);

            OrderReturn map1 = modelMapper.map(dto, OrderReturn.class);
            orderReturnRepo.save(map1);
        }
    }

    @Override
    public void updateOrderReturn(OrderReturnDTO dto) {

    }

    @Override
    public OrderReturnDTO searchOrderReturn(String id) {
        return null;
    }

    @Override
    public void deleteCOrderReturn(String id) {

    }

    @Override
    public List<OrderReturnDTO> getAllOrderReturns() {
        return null;
    }

    @Override
    public boolean searchOrderReturnAvailable(String id) {
        boolean b = orderReturnRepo.existsById(id);
        System.out.println(id);
        System.out.println(b);
        return false;
    }
}
