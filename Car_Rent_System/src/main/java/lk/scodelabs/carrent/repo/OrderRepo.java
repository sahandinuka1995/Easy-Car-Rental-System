package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, String> {
    public boolean deleteByOrderId(String id);
}
