package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {//interface == father, classes why implements methods are = children
	BigDecimal calcular(Orcamento orcamento);
}
