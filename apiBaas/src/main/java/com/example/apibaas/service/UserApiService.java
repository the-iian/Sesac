package com.example.apibaas.service;

import com.example.apibaas.model.PasswordResetRequest;
import com.example.apibaas.model.PasswordResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;

@Service
@AllArgsConstructor
@Slf4j
public class UserApiService {

    private final ApiService<PasswordResponse> apiService;

    public PasswordResponse callPostExternalServer(){
        PasswordResetRequest passwordReset = PasswordResetRequest.builder()
                .tenantId("aaa")
                .apiKey("bbb")
                .email("ccc")
                .build();

        HttpHeaders headers = new HttpHeaders();
        PasswordResponse response = apiService
                .post("https://d7999725-76e2-4c80-89a9-d561f0b0c1fa.mock.pstmn.io/auth/reset-password", headers, passwordReset, PasswordResponse.class)
                .getBody();

        System.out.println(">>>> response = " + response);
        return response;
    }

}
