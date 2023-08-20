package com.example.apibaas;

import com.example.apibaas.controller.RestTemplateTestController;
import com.example.apibaas.model.PasswordResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class RestTemplateTestServiceTest {

    @Autowired
    RestTemplateTestController controller;

    @Test
    public void restTemplateTest(){
        ResponseEntity<PasswordResponse> entity = controller.restTemplateTest1();
        System.out.println(">>> entity = " + entity.getStatusCode());
        Assertions.assertEquals(entity.getStatusCodeValue(), 200);

    }
}
