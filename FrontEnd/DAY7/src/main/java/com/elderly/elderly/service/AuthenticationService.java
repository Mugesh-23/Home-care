package com.elderly.elderly.service;

import com.elderly.elderly.dto.request.LoginRequest;
import com.elderly.elderly.dto.request.RegisterRequest;
import com.elderly.elderly.dto.response.LoginResponse;
import com.elderly.elderly.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}