package com.agendador.usuario.infrastructure.repository;

import com.agendador.usuario.infrastructure.entity.Users;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<Users, Long> {

    boolean existsByEmail(String email);

    Optional<Users> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
