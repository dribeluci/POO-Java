/* Crie uma classe conta bancária e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto conta bancária, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class ContaBancaria {
	
		private String nomeUsuario;
		private String nomeBanco;
		private int agencia;
		private int conta;
		
	 
		
		void saque() {
			System.out.println("Saque realizado dia 06.03: R$20,00");
		}
		
		public String getNomeUsuario() {
			return nomeUsuario;
		}
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}
		public String getNomeBanco() {
			return nomeBanco;
		}
		public void setNomeBanco(String nomeBanco) {
			this.nomeBanco = nomeBanco;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getConta() {
			return conta;
		}
		public void setConta(int conta) {
			this.conta = conta;
		}
		
	}

