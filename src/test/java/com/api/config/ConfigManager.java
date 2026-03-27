package com.api.config;

public final class ConfigManager {

    private ConfigManager() {}

    public static String get(String key) {
        // 1) JVM system props override: -Dkey=value
        String v = System.getProperty(key);
        if (v != null && !v.isBlank()) return v;

        // 2) OS env vars: key -> KEY (dots -> underscores)
        String envKey = key.toUpperCase().replace('.', '_');
        v = System.getenv(envKey);
        if (v != null && !v.isBlank()) return v;

        throw new RuntimeException("Missing required config: " + key + " (env var: " + envKey + ")");
    }

    public static String env() {
        // reads ENV
        return get("env").trim().toUpperCase();
    }

    public static String baseUrl() {
        // ENV=qa -> reads BASE_URL_QA
        return get("base.url." + env());
    }
    
    public static String businessBaseUrl() {
        return get("businessBase.url." + env());
    }
    
    public static String userEmail() {
        return get("user.email");
    }

    public static String userPassword() {
        return get("user.password");
    }
}
