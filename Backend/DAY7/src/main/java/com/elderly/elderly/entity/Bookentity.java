package com.elderly.elderly.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Book")
public class Bookentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "age",nullable = false)
    private Integer age;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "mobile",nullable = false)
    private Long mobile;

    @Column(name = "servicename",nullable = false)
    private String servicename;

    @Column(name = "paymentmethod",nullable = false)
    private String paymentmethod;

}
