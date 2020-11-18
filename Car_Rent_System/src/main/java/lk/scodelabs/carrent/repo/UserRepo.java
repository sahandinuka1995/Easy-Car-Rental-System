package lk.scodelabs.carrent.repo;

import lk.scodelabs.carrent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
