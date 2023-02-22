package br.com.carteiradoze.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.carteiradoze.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

	public List<Transacao> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
