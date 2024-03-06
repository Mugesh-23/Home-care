package com.elderly.elderly.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bookdto {
    private Long id;
    private String username;
    private Integer age;
    private String email;
    private Long mobile;
    private String serviceName;
    private String paymentMethod;
}
