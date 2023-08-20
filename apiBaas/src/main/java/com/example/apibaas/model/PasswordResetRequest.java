package com.example.apibaas.model;

import lombok.*;

import javax.persistence.*;

// 요청용
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PasswordResetRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String tenantId;
    private String apiKey;
    private String email;

}