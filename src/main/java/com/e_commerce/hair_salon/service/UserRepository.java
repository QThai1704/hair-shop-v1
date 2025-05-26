package com.e_commerce.hair_salon.service;

import com.e_commerce.hair_salon.domain.authen.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
