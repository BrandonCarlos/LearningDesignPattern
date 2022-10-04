package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ISS implements Imposto {
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {//Here make only calculate of ICMS
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
	
}
