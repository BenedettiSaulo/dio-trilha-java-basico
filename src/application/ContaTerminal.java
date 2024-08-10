package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Conta!");
		Integer numero = teclado.nextInt();

		System.out.println("Por favor, digite o número da Agência!");
		String agencia = teclado.next();

		System.out.println("Por favor, digite o seu nome!");
		String nomeCliente = teclado.next();

		System.out.println("Por favor, digite o saldo da conta!");
		Double saldo = teclado.nextDouble();

		System.out.printf(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
				nomeCliente, agencia, numero, saldo);

		teclado.close();
	}
}
