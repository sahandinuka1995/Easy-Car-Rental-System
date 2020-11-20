package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.OrderReturn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReturnRepo extends JpaRepository<OrderReturn, String> {
}
