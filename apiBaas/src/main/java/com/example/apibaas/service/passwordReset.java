package com.example.apibaas.service;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 요청용
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class passwordReset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tenantId;
    private String apiKey;
    private String email;

}