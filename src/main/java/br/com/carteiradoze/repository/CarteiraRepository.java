package br.com.carteiradoze.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carteiradoze.model.Carteira;

@Repository
public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
	public List<Carteira> findAllByMeta (BigDecimal meta);
}
