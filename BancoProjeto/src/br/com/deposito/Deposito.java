package br.com.deposito;

import java.util.Locale;
import java.util.Scanner;

public class Deposito {

	public static void main(String[] args) {

		//Definindo a linguagem do programa para que seja utilizado "." em double
		Locale.setDefault(Locale.US);

		Scanner deposi_client = new Scanner(System.in); 

		//Embandeirar as variáveis que utilizarei como "comando"
		double deposito = 0;
		char depositar = 'd';
		char visualizar = 'v';
		char sair = 's';
		boolean escolha = true;

		//loop para que o cliente consiga utilizar o programa até que ele ordene que saia
		while (escolha == true) {
			System.out.println("Selecione uma opção");
			System.out.print("[d]epositar, [v]isualizar, [s]air: ");
			char opcao = deposi_client.next().charAt(0);

			//deposito
			if (opcao == depositar) {
				System.out.print("Insira o valor a se depositar: ");
				deposito += deposi_client.nextDouble();
			}
			//visualização
			else if (opcao == visualizar) {
				System.out.print("Esse é o seu saldo bancário até o momento: ");
				System.out.println(deposito);
			}
			//saida
			else if (opcao == sair) {
				System.out.println("Saindo...");
				escolha = false;
			}
		}
		deposi_client.close();
	}
}
