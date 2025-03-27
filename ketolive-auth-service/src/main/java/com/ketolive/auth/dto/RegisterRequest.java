package com.ketolive.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO для регистрации
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

        private String name;
        private String email;
        private String password;
}