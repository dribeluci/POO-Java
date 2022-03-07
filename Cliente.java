/* Crie uma classe cliente e apresente os atributos 
e métodos referentes esta classe, em seguida crie um 
objeto cliente, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package br.com.generation.exerciciosPO;

public class Cliente {

    String nome;
    int cpf;
    char sexo;
    int idade;
    double saldo;
    double saldoRestante;
    double valorProduto;

    public void pagamento(double valor) {
        saldoRestante =  saldo - valor;
    }

    public void recebe () {
        System.out.println("Compra realizada: Americanas - Valor de R$" + valorProduto);
    }

}
