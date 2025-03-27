package com.ketolive.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO для ответа
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String refreshToken;
    private Long userId;
    private String email;
    private String name;
}
