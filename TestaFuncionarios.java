/* Crie uma classe funcionário e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto funcionário, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaFuncionarios {
public static void main(String[] args) {
		
		Funcionarios fun1 =new Funcionarios();
		
		fun1.setNome("Ana");
		fun1.setIdade(26);
		fun1.setCargo("Analista Financeiro");
		fun1.setCodigofuncionario(34567);
		
		
		System.out.println("--------Informações do Funcionário----------");
		System.out.println();
		System.out.println("Nome: "+fun1.getNome());
		System.out.println("Idade: "+fun1.getIdade());
		System.out.println("Cargo: "+fun1.getCargo());
		System.out.println("Codigo: "+fun1.getCodigofuncionario());
		
	}

}


