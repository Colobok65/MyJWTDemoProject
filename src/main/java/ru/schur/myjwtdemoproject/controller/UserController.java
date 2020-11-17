package ru.schur.myjwtdemoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.schur.myjwtdemoproject.dto.UserDTO;
import ru.schur.myjwtdemoproject.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/jwt_app/user/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.toListUserDTO(userService.getAllUsers());
    }

}
