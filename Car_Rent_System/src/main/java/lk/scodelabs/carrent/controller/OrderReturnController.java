package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.OrderReturnDTO;
import lk.scodelabs.carrent.service.OrderReturnService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/orderReturn")
public class OrderReturnController {

    @Autowired
    OrderReturnService orderReturnService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveOrderReturn(@RequestBody OrderReturnDTO dto) {
        orderReturnService.saveOrderReturn(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchOrderReturn(@PathVariable String id) {
        boolean status = orderReturnService.searchOrderReturnAvailable(id);

        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
