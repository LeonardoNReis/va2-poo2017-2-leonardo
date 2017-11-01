package br.unincor.controle;

import br.unincor.exception.PrecoZeradoException;
import br.unincor.model.Produto;
import br.unincor.model.Sanduiche;
import br.unincor.model.Sobremesa;
import java.util.List;

public class CalculoPrecos {

	/**
	 * Primeiro deve-se testar se o preço do produto não está 'null' - Caso o
	 * preço esteja zerado ('null'), lançar uma PrecoZeradoException
	 *
	 * Realizar o cálculo do preço final do produto seguindo as regras:
	 *
	 * Sanduiche: - Trio: se for TRUE acrescenta R$XX,XX no preço (valor
	 * referente a batata e bebida) - Dobro de recheio: ser for TRUE acresce o
	 * preço em XX%
	 *
	 * Sobremesa: - Adicionais: se for TRUE acresce o preço em XX%
	 *
	 * @param p
	 * @throws br.unincor.exception.PrecoZeradoException
	 */
	public void calculaPrecoFinal(Produto p) throws PrecoZeradoException {
		if (p.getPreco() != null && p.getPreco() != 0) {

			if (p instanceof Sanduiche) {
				Sanduiche sanduiche = (Sanduiche) p;
				if (sanduiche.getTrio()) {
					sanduiche.setPreco(sanduiche.getPreco() + 15.0);
				}
				if (sanduiche.getDobroRecheio()) {
					sanduiche.setPreco(sanduiche.getPreco() * 1.3);
				}

			} else if (p instanceof Sobremesa) {
				Sobremesa sobremesa = (Sobremesa) p;
				if (sobremesa.getAdicionais()) {
					sobremesa.setPreco(sobremesa.getPreco() * 1.35);
				}
			}
		} else {
			throw new PrecoZeradoException(p);
		}

	}

	/**
	 * No pagamento em dinheiro após o calculo final do preço, dar desconto de
	 * XX%.
	 *
	 * @param listProduto
	 * @return
	 */
	public Double pagtoDinheiro(List<Produto> listProduto) {
		Double somaPreco = 0.0;
		for (Produto produto : listProduto) {
			somaPreco += produto.getPreco();
		}
		return somaPreco * 0.9;
	}

	/**
	 * No pagamento em dinheiro após o calculo final do preço, acrescer XX% no
	 * valor do preço.
	 *
	 * @param listProduto
	 * @return
	 */
	public Double pagtoCartao(List<Produto> listProduto) {
		Double somaPreco = 0.0;
		for (Produto produto : listProduto) {
			somaPreco += produto.getPreco();
		}
		return somaPreco * 1.05;
	}

}
