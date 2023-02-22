package br.com.carteiradoze.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.carteiradoze.model.Movimentacao;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
	public List<Movimentacao> findAllByValor(@Param("valor") BigDecimal valor);

	public List<Movimentacao> findAllByDataTransacao(@Param("data") LocalDateTime data);
}
