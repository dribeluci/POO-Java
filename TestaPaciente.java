/* Crie uma classe paciente e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto paciente, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class TestaPaciente {

	public static void main(String[] args) {

		Paciente pa1 = new Paciente();
		
		pa1.setNome("Cleuza");
		pa1.setIdade(70);
		pa1.setEstado("médio/ supervisão");
		pa1.setTratamento("Infecção Urinária");
		
		System.out.println("-----Informações do paciente-----");
		System.out.println("Nome:" + pa1.getNome());
		System.out.println("Idade: "+ pa1.getIdade());
		System.out.println("Estado: "+ pa1.getEstado());
		System.out.println("Tipo de tratamento: "+pa1.getTratamento());
		
		
		pa1.Remedio();
		System.out.println();
		
	}
}
