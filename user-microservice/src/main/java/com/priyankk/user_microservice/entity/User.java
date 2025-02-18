package com.priyankk.user_microservice.entity;



import java.time.LocalDate;

import com.priyankk.user_microservice.enumerators.Gender;
import com.priyankk.user_microservice.enumerators.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    private String password;
    private String mobile;
    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    private Gender gender;	

    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Address address;
    
    @Enumerated(EnumType.STRING)
    private Role role;
}
