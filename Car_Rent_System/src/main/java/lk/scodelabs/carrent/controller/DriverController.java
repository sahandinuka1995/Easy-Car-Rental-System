package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.DriverDTO;
import lk.scodelabs.carrent.service.DriverService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveDriver(@RequestBody DriverDTO dto) {
        driverService.saveDriver(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto) {
        driverService.updateDriver(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteDriver(String id) {
        driverService.deleteDriver(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchDriver(@PathVariable String id) {
        driverService.searchDriver(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllDrivers() {
        List<DriverDTO> allDrivers = driverService.getAllDrivers();
        StandardResponse response = new StandardResponse(200, "Success", allDrivers);
        return new ResponseEntity(response, HttpStatus.CREATED);

    }
}
