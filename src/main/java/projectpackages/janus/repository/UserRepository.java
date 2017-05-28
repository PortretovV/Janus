package projectpackages.janus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectpackages.janus.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
