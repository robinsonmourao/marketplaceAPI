package com.a4s.marketplaceAPI.repository;

import com.a4s.marketplaceAPI.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//responsavel por interagir com banco de dados
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
