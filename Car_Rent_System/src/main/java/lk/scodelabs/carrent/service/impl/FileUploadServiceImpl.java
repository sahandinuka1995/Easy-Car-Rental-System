package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.service.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
@Transactional
public class FileUploadServiceImpl implements FileUploadService {
    public static String uploadDirectory = "/home/sahan/Documents/Spring/sdsa/Car_Rent_System_View/assets/uploads/nic/";

    @Override
    public void uploadNicFile(MultipartFile file, String id) throws IOException {
        file.transferTo(new File(uploadDirectory + id));
        System.out.println(uploadDirectory);
    }
}
