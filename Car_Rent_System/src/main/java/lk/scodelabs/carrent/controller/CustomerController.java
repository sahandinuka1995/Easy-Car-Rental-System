package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping
    public CustomerDTO getAllCustomers() {
        return new CustomerDTO("952281372v", true, "Panadura", "0777290322");
    }
}
