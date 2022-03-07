/* Crie uma classe avião e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto avião, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/package br.com.generation.exerciciosPO;

public class Aviao {

		
		private String modelo;
		private String companhia;
		private int lugares;
		private int saidaEmergencia;
		private int banheiros;
		
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getcompanhia() {
			return companhia;
		}
		public void setcompanhia(String companhia) {
			this.companhia = companhia;
		}
		public int getlugares() {
			return lugares;
		}
		public void setlugares(int lugares) {
			this.lugares = lugares;
		}
		public int getsaidaEmergencia() {
			return saidaEmergencia;
		}
		public void setsaidaEmergencia(int saidaEmergencia) {
			this.saidaEmergencia = saidaEmergencia;
		}
		public int getbanheiros() {
			return banheiros;
		}
		public void setbanheiros(int banheiros) {
			this.banheiros = banheiros;
		}
		
	}