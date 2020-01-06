package com.example.taskmanagerapi.serverresponse;

public class SignUpResponse {
    private String status;
    private String token;

    public SignUpResponse(String token, String status) {
        this.token = token;
        this.status = status;
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
