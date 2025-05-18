package com.e_commerce.hair_salon.domain.authen;

import com.e_commerce.hair_salon.util.constant.Gender;
import com.e_commerce.hair_salon.util.constant.Status;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //  Attribute
    private String username;
    private String password;
    private String lastName;
    private String firstName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String email;
    private Date birthday;
    private String avatar;
    private String code;
    private String jobTitle;
    private String department;
    private String managerId;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String rememberToken;
    private String activeCode;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    //  Relationship
}
