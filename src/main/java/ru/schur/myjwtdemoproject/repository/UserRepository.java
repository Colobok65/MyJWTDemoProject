package ru.schur.myjwtdemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.schur.myjwtdemoproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByLogin(String login);
}
