package projectpackages.janus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectpackages.janus.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
