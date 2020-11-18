package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver, String> {
}
