/*
* Classe Usuario - Representa um usuario na aplicacao
* @author Lucas Carvalho 
* @version 1.0, 2020-11-08
*/

package model;

public class Usuario {
	private String nomeUsuario; /** Nome de usuario do usuario */
	private String senha; /** Senha do usuario */
	
	/*
	* Construtor da classe.
	*/
	public Usuario() {
	}
	
	/**
	* Construtor da classe.
	* @param nomeUsuario nome do usuário
	* @param senha senha do usuário
	*/
	public Usuario(String nomeUsuario, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	/**
	 * Pega o nome do usuario
	 * @return String nome do usuario 
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * Adiciona o nome do usuario
	 * @param nomeUsuario nome de usuario do usuario
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * Pega a senha do usuario
	 * @return String senha do usuario 
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Adiciona a senha do usuario
	 * @param senha senha do usuario
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
