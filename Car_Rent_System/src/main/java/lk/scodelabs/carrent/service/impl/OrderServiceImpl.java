package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.OrderDTO;
import lk.scodelabs.carrent.entity.Orders;
import lk.scodelabs.carrent.repo.CustomerRepo;
import lk.scodelabs.carrent.repo.OrderRepo;
import lk.scodelabs.carrent.service.OrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveOrder(OrderDTO dto) {
        if (!orderRepo.existsById(dto.getOrderId())) {
            orderRepo.save(modelMapper.map(dto, Orders.class));
        } else {
            throw new RuntimeException("This Order is already Exist!");
        }
    }

    @Override
    public void updateOrder(OrderDTO dto) {
        if (orderRepo.existsById(dto.getOrderId())) {
            orderRepo.save(modelMapper.map(dto, Orders.class));
        } else {
            throw new RuntimeException("Order Not Found!");
        }
    }

    @Override
    public OrderDTO searchOrder(String id) {
        Optional<Orders> order = orderRepo.findById(id);
        if (order.isPresent()) {
            return modelMapper.map(order.get(), OrderDTO.class);
        } else {
            throw new RuntimeException("Order does not exist!");
        }
    }

    @Override
    public void deleteOrder(String id) {
        if (orderRepo.existsById(id)) {
            orderRepo.deleteByOrderId(id);
        } else {
            throw new RuntimeException("Couldn't to delete Order!");
        }
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return modelMapper.map(orderRepo.findAll(), new TypeToken<List<OrderDTO>>() {
        }.getType());
    }
}
