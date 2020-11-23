package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.PaymentDTO;
import lk.scodelabs.carrent.service.PaymentService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/orderReturnPayment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity savePayment(@RequestBody PaymentDTO dto) {
        paymentService.savePayment(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
