/* Crie uma classe funcion�rios e apresente os atributos 
e m�todos referentes esta classe, em seguida crie um 
objeto funcion�rios, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class Funcionarios {
	
		
		private String nome;
		private int idade;
		private String cargo;
		private int codigofuncionario;
		
		
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
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public int getCodigofuncionario() {
			return codigofuncionario;
		}
		public void setCodigofuncionario(int codigofuncionario) {
			this.codigofuncionario = codigofuncionario;
		}	
}

