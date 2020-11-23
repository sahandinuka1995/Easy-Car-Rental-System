package lk.scodelabs.carrent.controller;

import lk.scodelabs.carrent.service.FileUploadService;
import lk.scodelabs.carrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/upload")
public class fileUploadController {

    @Autowired
    FileUploadService fileUploadService;

    @PostMapping(params = {"id"})
    public ResponseEntity saveNicImage(@RequestParam("file") MultipartFile file, String id) throws IOException {
        fileUploadService.uploadNicFile(file, id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping(params = {"oid"})
    public ResponseEntity saveBankSlipImage(@RequestParam("file") MultipartFile file, String oid) throws IOException {
        fileUploadService.uploadOrderFile(file, oid);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping(params = {"regNo"})
    public ResponseEntity saveBankSlipImage(@RequestParam("file") MultipartFile[] file, String regNo) throws IOException {
        fileUploadService.uploadCarFiles(file, regNo);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
