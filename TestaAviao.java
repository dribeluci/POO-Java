/* Crie uma classe avi�o e apresente os atributos 
e m�todos referentes esta classe, em seguida crie um 
objeto avi�o, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao cad1 = new Aviao();

		cad1.setModelo("Boeing 787-9");
		cad1.setcompanhia("LATAM");
		cad1.setlugares(304);
		cad1.setsaidaEmergencia(8);
		cad1.setbanheiros(8);
		

		System.out.println("Especifica��es do avi�o: ");
		System.out.println("Modelo: " + cad1.getModelo());
		System.out.println("Companhia A�rea: " + cad1.getcompanhia());
		System.out.println("Capacidade de pessageiros: " + cad1.getlugares());
		System.out.println("N�mero de sa�das de emerg�ncia: " + cad1.getsaidaEmergencia());
		System.out.println("N�mero de banheiros: " + cad1.getbanheiros());
	
	}

}