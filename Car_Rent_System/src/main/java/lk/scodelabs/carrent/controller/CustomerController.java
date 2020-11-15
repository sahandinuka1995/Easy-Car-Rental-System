package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.CustomerDTO;
import lk.scodelabs.carrent.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping()
    public void saveCustomer(@RequestBody CustomerDTO dto) {
        customerService.saveCustomer(dto);
    }


}
