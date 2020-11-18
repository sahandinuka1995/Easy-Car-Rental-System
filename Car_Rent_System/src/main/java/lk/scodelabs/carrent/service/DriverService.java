package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.DriverDTO;

import java.util.List;


public interface DriverService {
    void saveDriver(DriverDTO dto);

    void updateDriver(DriverDTO dto);

    DriverDTO searchDriver(String id);

    void deleteDriver(String id);

    List<DriverDTO> getAllDrivers();
}
