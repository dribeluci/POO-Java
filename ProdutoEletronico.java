/* Crie uma classe produto eletr�nico e apresente os atributos 
e m�todos referentes esta classe, em seguida crie um 
objeto produto eletr�nico, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class ProdutoEletronico {

		private String Tipo;
		private String Marca;
		private String Modelo;
		private String Cor; 
		
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String Tipo) {
			this.Tipo = Tipo;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String string) {	
			
		}
		public String getModelo() {
			return Modelo;
		}
		public void setModelo(String Modelo) {
			this.Modelo = Modelo;
		}
		public String getCor() {
			return Cor;
		}
		public void setCor(String Cor) {
			this.Cor = Cor;
		}	
}
	

