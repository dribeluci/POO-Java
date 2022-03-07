/* Crie uma classe patinete e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto patinete, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaPatinete {
	public static void main(String[] args) {

		Patinete p1 = new Patinete();

		p1.setMarca("Pop Brinquedos");
		p1.setModelo("Patinete Infantil com 3 Rodas e Luz SK19800-A Pop");
		p1.setAnoFabricacao(2020);
		p1.setCor("Azul");

		System.out.println("---- informações do patinete ----");
		System.out.println();
		System.out.println("Marca: " + p1.getMarca());
		System.out.println("Modelo: " + p1.getModelo());
		System.out.println("Ano:"+p1.getAnoFabricacao());
		System.out.println("Cor: " + p1.getCor());
		
		
		
		System.out.println();
		p1.defeito();
	}

}
