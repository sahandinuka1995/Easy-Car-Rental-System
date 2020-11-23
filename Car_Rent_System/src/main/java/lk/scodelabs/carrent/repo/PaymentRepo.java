package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, String> {
}
