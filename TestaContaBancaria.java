package br.com.generation.exerciciosPO;

public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();

		c1.setNomeUsuario("Bruna");
		c1.setNomeBanco("Itaú");
		c1.setAgencia(0001);
		c1.setConta(375588);
		
		System.out.println("--------Os dados do usuario é-------");
		
		
		System.out.println("Nome: "+c1.getNomeUsuario());
		System.out.println("Banco: "+c1.getNomeBanco());
		System.out.println("Agência: " +c1.getAgencia());
		System.out.println("Conta: " +c1.getConta());
		System.out.println();
		
		c1.saque();
		System.out.println();
			
	}
}
