package com.e_commerce.hair_salon.domain.authen;

import com.e_commerce.hair_salon.domain.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permissions")
public class Permission extends AbstractEntity<Long> implements Serializable {

    //  Attribute
    @Column(name = "name")
    private String name;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "guard_name")
    private String guardName;

    //  Relationship
    @ManyToMany(mappedBy = "permissions")
    List<Role> roles;

    @ManyToMany(mappedBy = "permissions")
    List<User> users;
}
