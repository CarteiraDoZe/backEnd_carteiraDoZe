package br.com.carteiradoze.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carteiradoze.model.Quilometragem;

@Repository
public interface QuilometragemRepository extends JpaRepository<Quilometragem, Long> {
}
