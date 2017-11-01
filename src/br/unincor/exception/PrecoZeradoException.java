package br.unincor.exception;

import br.unincor.model.Produto;

/**
 * Receber um objeto "Produto" via construtor e implementar o método
 * 'getMessage()' retornando o texto:
 *
 * "O produto <nome do produto> está com o preço zerado!"
 *
 */
public class PrecoZeradoException extends Exception {

	private Produto produto;

	public PrecoZeradoException(Produto produto) {
		super();
		this.produto = produto;
	}

	@Override
	public String getMessage() {
		return "O Produto " + this.produto.getNome() + " está com o preço zerado!";
	}

	// private static final long serialVersionUID = 1L;

}
