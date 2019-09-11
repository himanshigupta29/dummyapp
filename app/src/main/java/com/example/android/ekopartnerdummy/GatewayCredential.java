package com.example.android.ekopartnerdummy;

public class GatewayCredential {

    private String secret_key_timestamp;
    private String secret_key;

    public GatewayCredential(String secret_key_timestamp, String secret_key) {
        this.secret_key_timestamp = secret_key_timestamp;
        this.secret_key = secret_key;

    }

    public String getSecretKeyTimestamp() {
        return secret_key_timestamp;
    }

    public String getSecretKey() {
        return secret_key;
    }

}
