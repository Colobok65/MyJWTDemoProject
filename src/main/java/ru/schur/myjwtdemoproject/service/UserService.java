package ru.schur.myjwtdemoproject.service;

import org.springframework.stereotype.Service;
import ru.schur.myjwtdemoproject.dto.UserDTO;
import ru.schur.myjwtdemoproject.model.Role;
import ru.schur.myjwtdemoproject.model.User;
import ru.schur.myjwtdemoproject.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.getOne(id);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public List<UserDTO> toListUserDTO(List<User> users){
        return users.stream().map(this::toUserDTO).collect(Collectors.toList());
    }

    public UserDTO toUserDTO(User user){
        return new UserDTO(user.getId(),
                user.getName(),
                user.getRoles().stream().map(Role::getName).collect(Collectors.toList()));
    }

}
