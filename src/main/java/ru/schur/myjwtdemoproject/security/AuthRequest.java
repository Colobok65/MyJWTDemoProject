package ru.schur.myjwtdemoproject.security;

import lombok.Data;

@Data
public class AuthRequest {
    private String name;
    private String password;
}
