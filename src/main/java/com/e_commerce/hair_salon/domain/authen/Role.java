package com.e_commerce.hair_salon.domain.authen;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //  Attribute
    private String name;
    private String displayName;
    private String guardName;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    //  Relationship
}
