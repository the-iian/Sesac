package com.example.apibaas.controller;

import com.example.apibaas.model.PasswordResponse;
import com.example.apibaas.service.UserApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class RestTemplateTestController {

    private final UserApiService userApiService;

    @PostMapping
    public ResponseEntity<PasswordResponse> restTemplateTest1(){

        return ResponseEntity.ok(userApiService.callPostExternalServer());

    }

}
