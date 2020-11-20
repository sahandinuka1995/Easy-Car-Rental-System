package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.CarDTO;
import lk.scodelabs.carrent.entity.Car;
import lk.scodelabs.carrent.repo.CarRepo;
import lk.scodelabs.carrent.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CarRepo carRepo;

    @Override
    public void saveCar(CarDTO dto) {
        if (!carRepo.existsById(dto.getRegNo())) {
            carRepo.save(modelMapper.map(dto, Car.class));
        } else {
            throw new RuntimeException("This Car is already Exist!");
        }
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRegNo())) {
            carRepo.save(modelMapper.map(dto, Car.class));
        } else {
            throw new RuntimeException("Car Not Found!");
        }
    }

    @Override
    public CarDTO searchCar(String id) {
        Optional<Car> car = carRepo.findById(id);
        if (car.isPresent()) {
            return modelMapper.map(car.get(), CarDTO.class);
        } else {
            throw new RuntimeException("Car does not exist!");
        }
    }

    @Override
    public void deleteCar(String id) {
//        if (carRepo.existsById(id)) {
//            carRepo.deleteById(id);
//        } else {
//            throw new RuntimeException("Couldn't to delete Car!");
//        }
        System.out.println(id);
    }

    @Override
    public List<CarDTO> getAllCars() {
        return modelMapper.map(carRepo.findAll(), new TypeToken<List<CarDTO>>() {
        }.getType());
    }
}
