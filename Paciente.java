/* Crie uma classe paciente e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto paciente, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class Paciente {


	private String nome;
	private int idade;
	private String estado;
	private String tratamento;
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public void Remedio() {
		System.out.println("Tratar com: 10 dias de antibiótico");
	}
	
}