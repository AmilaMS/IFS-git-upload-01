package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.RoleName;
import com.example.demo.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {




    Trainer findByName(String trainerName);
    Boolean existsByEmail(String email);


    Boolean existsByUsername(String username);
}
