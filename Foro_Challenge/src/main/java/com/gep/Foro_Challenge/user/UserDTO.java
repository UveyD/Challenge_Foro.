package com.gep.Foro_Challenge.user;

public record UserDTO(
        String name,
        String username,
        String password,
        Boolean enable
) {
}
