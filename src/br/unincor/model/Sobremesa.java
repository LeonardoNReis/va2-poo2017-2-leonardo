package br.unincor.model;

/**
 * Implementar relacionamento de herança com a classe "Produto"
 *
 */
public class Sobremesa extends Produto {

	private Boolean adicionais; // Define se adiciona mais alguns ingredientes -
								// sem validação

	/**
	 * Criar um construtor que recebe todos os atributos como parâmetro
	 *
	 *
	 * @param nome
	 * @param preco
	 * @param adicionais
	 */
	public Sobremesa(String nome, Double preco, Boolean adicionais) {
		super(nome, preco);
		this.adicionais = adicionais;
	}

	/**
	 * Criar getters e setters
	 *
	 *
	 * @return
	 */
	public Boolean getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Boolean adicionais) {
		this.adicionais = adicionais;
	}

	/**
	 * Implementar para mostrar os valores de todos os atributos
	 *
	 *
	 * @return
	 */
	@Override
	public String verDados() {
		return "--SOBREMESA--\n" + super.verDados() + "\nAdicionais = " + this.adicionais;
	}

}
