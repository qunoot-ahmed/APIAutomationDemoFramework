package com.api.routes;

public final class AuthRoutes {
    private AuthRoutes() {}

    public static final String BASE = "/authentication/v1.1";
    public static final String LOGIN = BASE + "/login";
    public static final String SIGNUP = BASE + "/signup";
    public static final String FORGOT_PASSWORD = BASE + "/forgot-password";
    public static final String LOGOUT = BASE + "/logout";
}