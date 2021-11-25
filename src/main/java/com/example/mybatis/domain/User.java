package com.example.mybatis.domain;

import com.example.mybatis.domain.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String email;
    private String password;
    private LocalDate birthday;
    private Sex sex;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
