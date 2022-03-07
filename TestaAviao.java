/* Crie uma classe avião e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto avião, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao cad1 = new Aviao();

		cad1.setModelo("Boeing 787-9");
		cad1.setcompanhia("LATAM");
		cad1.setlugares(304);
		cad1.setsaidaEmergencia(8);
		cad1.setbanheiros(8);
		

		System.out.println("Especificações do avião: ");
		System.out.println("Modelo: " + cad1.getModelo());
		System.out.println("Companhia Aérea: " + cad1.getcompanhia());
		System.out.println("Capacidade de pessageiros: " + cad1.getlugares());
		System.out.println("Número de saídas de emergência: " + cad1.getsaidaEmergencia());
		System.out.println("Número de banheiros: " + cad1.getbanheiros());
	
	}

}