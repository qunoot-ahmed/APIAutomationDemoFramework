package com.api.base;

import java.util.HashMap;

import com.api.config.ConfigManager;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.routes.AuthRoutes;
import io.restassured.response.Response;

public class AuthService extends BaseService {
    private static final String BASE_URI = ConfigManager.baseUrl(); // or ConfigManager.get("auth.base.url")

    public Response login(LoginRequest payload) {
        return postRequest(BASE_URI, payload, AuthRoutes.LOGIN);
    }

    public Response signUp(SignUpRequest payload) {
        return postRequest(BASE_URI, payload, AuthRoutes.SIGNUP);
    }

    public Response forgotPassword(String emailAddress) {
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
        return postRequest(BASE_URI, payload, AuthRoutes.FORGOT_PASSWORD);
    }

    public Response logout(String token) {
        setAuthToken(token);
        return getRequest(BASE_URI, AuthRoutes.LOGOUT);
    }
}