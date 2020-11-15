package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
}
