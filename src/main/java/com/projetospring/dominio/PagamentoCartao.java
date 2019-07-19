package com.projetospring.dominio;

import javax.persistence.Entity;
import com.projetospring.dominio.enums.EstadoPagamento;

@Entity
public class PagamentoCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroParcela;
	
	public PagamentoCartao() {
		
	}

	public PagamentoCartao(Long id, EstadoPagamento estado, Pedido pedido, Integer numeroParcela) {
		super(id, estado, pedido);
		this.numeroParcela = numeroParcela;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}
	
	
	

}
