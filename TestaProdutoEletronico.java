/* Crie uma classe produto eletr�nico e apresente os atributos 
e m�todos referentes esta classe, em seguida crie um 
objeto produto eletr�nico, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaProdutoEletronico {
	public static void main(String[] args) {
		ProdutoEletronico pe1 =new ProdutoEletronico();
		
		pe1.setTipo("Celular");
		pe1.setMarca("Iphone");
		pe1.setModelo("8");
		pe1.setCor("Preto");

		
		System.out.println("---------Informa��es sobre o aparelho eletronico---------");
		
		System.out.println("Tipo de eletronico: "+pe1.getTipo());
		System.out.println("Marca do produto: "+pe1.getMarca());
		System.out.println("Modelo do produto:  "+pe1.getModelo());
		System.out.println("Cor"+pe1.getCor());
		System.out.println();
	}

}


