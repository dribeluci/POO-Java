/* Crie uma classe funcion�rio e apresente os atributos 
e m�todos referentes esta classe, em seguida crie um 
objeto funcion�rio, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaFuncionarios {
public static void main(String[] args) {
		
		Funcionarios fun1 =new Funcionarios();
		
		fun1.setNome("Ana");
		fun1.setIdade(26);
		fun1.setCargo("Analista Financeiro");
		fun1.setCodigofuncionario(34567);
		
		
		System.out.println("--------Informa��es do Funcion�rio----------");
		System.out.println();
		System.out.println("Nome: "+fun1.getNome());
		System.out.println("Idade: "+fun1.getIdade());
		System.out.println("Cargo: "+fun1.getCargo());
		System.out.println("Codigo: "+fun1.getCodigofuncionario());
		
	}

}


