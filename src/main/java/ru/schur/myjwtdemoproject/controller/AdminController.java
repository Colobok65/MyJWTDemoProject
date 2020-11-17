package ru.schur.myjwtdemoproject.controller;

import org.springframework.web.bind.annotation.*;
import ru.schur.myjwtdemoproject.dto.UserDTO;
import ru.schur.myjwtdemoproject.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/jwt_app/admin/users")
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.toListUserDTO(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable("id") Long id){
        return userService.toUserDTO(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
