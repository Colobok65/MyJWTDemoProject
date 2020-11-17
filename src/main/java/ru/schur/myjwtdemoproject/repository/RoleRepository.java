package ru.schur.myjwtdemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.schur.myjwtdemoproject.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
