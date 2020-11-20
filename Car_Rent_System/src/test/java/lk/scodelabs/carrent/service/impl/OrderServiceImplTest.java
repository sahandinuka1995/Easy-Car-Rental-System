package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.config.WebAppConfig;
import lk.scodelabs.carrent.config.WebRootConfig;
import lk.scodelabs.carrent.entity.Car;
import lk.scodelabs.carrent.repo.CarRepo;
import lk.scodelabs.carrent.repo.CustomerRepo;
import lk.scodelabs.carrent.repo.OrderRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Optional;

@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class, WebRootConfig.class})
@RunWith(SpringRunner.class)
class OrderServiceImplTest {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    CarRepo carRepo;

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    @Test
    void saveOrder() {
//        Optional<Customer> byId = customerRepo.findById("952281372v");
//        if (byId.isPresent()){
//            System.out.println("sfsfs");
//        }

//        List<Customer> all = customerRepo.findAll();
//        System.out.println(all.size());

        Optional<Car> wpme6433 = carRepo.findById("wpme6433");
        System.out.println(wpme6433.get().toString());

//        Optional<Car> wpme6433 = carRepo.findById("wpme6433");
//        System.out.println(wpme6433.get());
//
//        Orders order = new Orders("qwf","f","af",true,234,true);
//        order.setCustomer(byId.get());
//        order.setCar(wpme6433.get());
//
//        orderRepo.save(order);
    }
}
