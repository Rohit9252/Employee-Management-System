package com.employeemanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    @NotNull(message = "First name cannot be null")
    @Size(min = 4, message = "First name must be at least 4 characters long")
    private String firstName;

    @Column(name = "last_name")
    @NotNull(message = "Last name cannot be null")
    private String lastName;

    @Column(name = "email_id", unique = true)
    @Email(message = "Email address is not valid")
    private String email;


}
