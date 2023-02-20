package br.com.carteiradoze.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_carteira")
public class Carteira {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O campo meta é obrigatório")
	public BigDecimal meta;
	
	@NotNull(message = "O campo valor da entrega é obrigatório")
	public BigDecimal valorEntrega;
	
	@NotNull(message = "O campo diaria é obrigatório")
	public BigDecimal diaria;
	
	/*@OneToMany(mappedBy = "carteira", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("carteira")
	private List<Movimentacao> movimentacao;*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getMeta() {
		return meta;
	}

	public void setMeta(BigDecimal meta) {
		this.meta = meta;
	}

	public BigDecimal getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(BigDecimal valorEntrega) {
		this.valorEntrega = valorEntrega;
	}

	public BigDecimal getDiaria() {
		return diaria;
	}

	public void setDiaria(BigDecimal diaria) {
		this.diaria = diaria;
	}
}
