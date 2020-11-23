package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.OrderDTO;
import lk.scodelabs.carrent.service.CarService;
import lk.scodelabs.carrent.service.CustomerService;
import lk.scodelabs.carrent.service.DriverService;
import lk.scodelabs.carrent.service.OrderService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @Autowired
    CarService carService;

    @Autowired
    DriverService driverService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addOrder(@RequestBody OrderDTO dto) {
        orderService.saveOrder(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateOrder(@RequestBody OrderDTO dto) {
        orderService.updateOrder(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteOrder(String id) {
        orderService.deleteOrder(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchOrder(@PathVariable String id) {
        OrderDTO ob = orderService.searchOrder(id);
        StandardResponse response = new StandardResponse(200, "Success", ob);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllOrders() {
        List<OrderDTO> allOrders = orderService.getAllOrders();
        StandardResponse response = new StandardResponse(200, "Success", allOrders);
        return new ResponseEntity(response, HttpStatus.CREATED);

    }

    @PutMapping(params = {"confirm"})
    public ResponseEntity confirmOrder(String confirm) {
        orderService.confirmOrder(confirm);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
