package ru.schur.myjwtdemoproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.schur.myjwtdemoproject.model.Role;

import java.util.List;

@Data
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private List<String> roles;
}
