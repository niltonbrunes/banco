package br.com.treeway;
import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		// objeto para ler dados da console, captura o que for digitado 
		Scanner c = new Scanner(System.in);
		
		// declara e inicializa saldo com valor digitado pelo usu�rio
		System.out.println("Digite o saldo inicial da conta");
		double saldoConta = c.nextDouble();
		
		// declara e inicializa o numero da conta digitado pelo usu�rio
		System.out.println("Digite o numero da conta");
		int numeroConta = c.nextInt();
		
		// Cria uma inst�ncia de ContaService onde est� presente as opera��es para Objeto Conta
		ContaService operacoesConta = new ContaService();
		
		// cria uma inst�ncia da classe Conta 
		Conta conta1 = new Conta();
		
		// altera valor dos atributos da inst�ncia da classe Conta
		conta1.setNumero(numeroConta);
		conta1.setSaldo(saldoConta);
		
		// Nova inst�ncia de Conta para transfer�ncia 
		Conta conta2 = new Conta();
		
		// Nova inst�ncia de Conta para transfer�ncia 
		Conta conta3 = new Conta();
		
		// Mostra dados da inst�ncia da classe Conta
			System.out.println("O numero da Conta1 :"+ conta1.getNumero());
			System.out.println("O saldo da Conta1 :"+ conta1.getSaldo());
			
			// chamada ao m�todo depositar para adicionar saldo da conta
			System.out.println("Ser� creditado 100 reais na conta ");
			operacoesConta.depositar(conta1, 100.00);
			System.out.println("Saldo da Conta1  :"+ conta1.getSaldo());
			
			// chamada ao m�todo sacar para debitar no saldo da conta
			System.out.println("Ser� debitado 56.43 reais na conta ");
			operacoesConta.sacar(conta1, 56.43);
			System.out.println("Saldo da Conta :"+ conta1.getSaldo());
			System.out.println("Saldo da Conta 1 :"+ conta1.getSaldo());
			System.out.println("Saldo da Conta 2 :"+ conta2.getSaldo());
			System.out.println("Saldo da Conta 3 :"+ conta3.getSaldo());
			
			// chamada ao m�todo tranferir para retirar o valor de conta1 para conta2
			System.out.println("Transferir 50.00 de conta 1 para conta2 ");
			operacoesConta.transferir(conta1, 50.00, conta2);
			System.out.println("Saldo da Conta 1 :"+ conta1.getSaldo());
			System.out.println("Saldo da Conta 2 :"+ conta2.getSaldo());
			System.out.println("Saldo da Conta 3 :"+ conta3.getSaldo());
			
	} 
}
