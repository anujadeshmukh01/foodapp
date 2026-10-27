package com.first.FoodApp.auth_users.services;

import com.first.FoodApp.auth_users.dtos.LoginRequest;
import com.first.FoodApp.auth_users.dtos.LoginResponse;
import com.first.FoodApp.auth_users.dtos.RegistrationRequest;
import com.first.FoodApp.response.Response;

public interface AuthService {


    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);










}
