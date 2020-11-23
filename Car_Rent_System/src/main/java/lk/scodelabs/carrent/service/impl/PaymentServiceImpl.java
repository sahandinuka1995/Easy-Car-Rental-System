package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.PaymentDTO;
import lk.scodelabs.carrent.repo.OrderRepo;
import lk.scodelabs.carrent.repo.OrderReturnRepo;
import lk.scodelabs.carrent.repo.PaymentRepo;
import lk.scodelabs.carrent.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;

    @Autowired
    OrderReturnRepo orderReturnRepo;

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void savePayment(PaymentDTO dto) {
//        Payment map = modelMapper.map(dto, Payment.class);
//        System.out.println(map);
//
//        Optional<OrderReturn> byId = orderReturnRepo.findById(dto.getOrderReturn().getOReturnId());
//        OrderReturn map1 = modelMapper.map(byId.get(), OrderReturn.class);
//        System.out.println(map1);
//
//        Optional<Orders> byId1 = orderRepo.findById(map1.getOrders().getOrderId());
//        Orders map2 = modelMapper.map(byId1.get(), Orders.class);
//
//        map1.setOrders(map2);
//        dto.setOrderReturn(map1);
//
//        System.out.println(dto);
////        paymentRepo.save(map);
    }

    @Override
    public void updatePayment(PaymentDTO dto) {

    }

    @Override
    public PaymentDTO searchPayment(String id) {
        return null;
    }

    @Override
    public void deletePayment(String id) {

    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return null;
    }
}
