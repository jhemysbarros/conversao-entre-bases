package view;

import java.util.Scanner;

import model.Questao04;

public class Menu {

	public void menu() {

		Questao04 q4 = new Questao04();
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;

		System.out.println("==================================================");
		System.out.println("|                 MENU DE SELEÇÃO                |");
		System.out.println("==================================================");
		System.out.println("| Opções:                                        |");
		System.out.println("|        1. Converter DECIMAL para BINÁRIO.      |");
		System.out.println("|        2. Converter DECIMAL para HEXADECIMAL.  |");
		System.out.println("|        3. Converter BINÁRIO para HEXADECIMAL.  |");
		System.out.println("|        4. Sair.                                |");
		System.out.println("==================================================");
		System.out.print("Opção: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("\nInforme o número decimal: ");
			int num1 = entrada.nextInt();
			q4.decimalParaBinario(num1);
			q4.imprimeDecimalParaBinario(num1);

			this.menu();
			break;
		case 2:
			System.out.print("\nInforme o número decimal: ");
			int num2 = entrada.nextInt();
			q4.decimalParaHexa(num2);
			q4.imprimeDecimalParaHexa(num2);

			this.menu();
			break;
		case 3:
			entrada.nextLine();

			System.out.print("Informe um número binário: ");
			String numeroBinario = entrada.nextLine();
			q4.binarioParaHexa(numeroBinario);

			q4.imprimeBinarioParaHexa(numeroBinario);

			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.err.println("\nOpção inválida!");

			this.menu();
			break;
		}
	}
}
