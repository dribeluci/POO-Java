/* Crie uma classe patinete e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto patinete, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class Patinete {

		private String marca;
		private String modelo;
		private int anoFabricacao;
		private String cor;
		
		
		
		void defeito() {
			System.out.println("O patinete está com defeito.");
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo= modelo;
		}
		public int getAnoFabricacao() {
			return anoFabricacao;
		}
		public void setAnoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
	}

