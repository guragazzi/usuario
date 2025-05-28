package com.agendador.usuario.infrastructure.repository;

import com.agendador.usuario.infrastructure.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
