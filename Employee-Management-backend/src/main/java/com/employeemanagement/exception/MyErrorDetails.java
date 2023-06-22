package com.employeemanagement.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyErrorDetails {
    private LocalDateTime localDateTime;
    private String message;
    private String details;

}
