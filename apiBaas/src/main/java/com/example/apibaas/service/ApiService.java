package com.example.apibaas.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@Slf4j
public class ApiService<T> {

    private final RestTemplate restTemplate;

    public ResponseEntity<T> post(String url, HttpHeaders httpHeaders, Object body, Class<T> tClass){
        return callApiEndpoint(url, HttpMethod.POST, httpHeaders, body, tClass);
    }

    private ResponseEntity<T> callApiEndpoint(String url, HttpMethod httpMethod, HttpHeaders httpHeaders, Object body, Class<T> tClass){
        return restTemplate.exchange(url, httpMethod, new HttpEntity<>(body, httpHeaders), tClass);
    }
}
