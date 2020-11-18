package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.dto.UserDTO;
import lk.scodelabs.carrent.service.UserService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveUser(@RequestBody UserDTO dto) {
        userService.saveUser(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody UserDTO dto) {
        userService.updateUser(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteUser(String id) {
        userService.deleteUser(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchUser(@PathVariable String id) {
        userService.searchUser(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllCustomers() {
        System.out.println("sdsfd");
        List<UserDTO> allUsers = userService.getAllUsers();
        StandardResponse response = new StandardResponse(200, "Success", allUsers);
        return new ResponseEntity(response, HttpStatus.CREATED);

    }
}
