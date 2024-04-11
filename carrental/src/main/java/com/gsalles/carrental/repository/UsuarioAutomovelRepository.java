package com.gsalles.carrental.repository;

import com.gsalles.carrental.entity.UsuarioAutomovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioAutomovelRepository extends JpaRepository<UsuarioAutomovel, Long> {
    Optional<UsuarioAutomovel> findByRecibo(String recibo);

    long countByUsuarioUsernameAndDataFimIsNotNull(String username);

    List<UsuarioAutomovel> findAllByUsuarioUsername(String username);
}
