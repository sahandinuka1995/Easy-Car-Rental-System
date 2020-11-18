package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, String> {
}
