package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.CarDTO;

import java.util.List;

public interface CarService {
    void saveCar(CarDTO dto);

    void updateCar(CarDTO dto);

    CarDTO searchCar(String id);

    void deleteCar(String id);

    List<CarDTO> getAllCars();
}
