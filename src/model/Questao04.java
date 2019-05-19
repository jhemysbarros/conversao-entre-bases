package model;

import java.util.Stack;

public class Questao04 {

	public String decimalParaBinario(int numero) {

		Stack<Integer> pilhaDecimalParaBinario = new Stack<>();
		String numBinario = "";
		int resto;

		while (numero > 0) {
			resto = numero % 2;
			pilhaDecimalParaBinario.push(resto);
			numero /= 2;
		}

		while (!pilhaDecimalParaBinario.isEmpty()) {
			numBinario += pilhaDecimalParaBinario.pop();
		}
		return numBinario;
	}

	public void imprimeDecimalParaBinario(int numero) {
		System.out.println("\n" + numero + " em binário é: " + decimalParaBinario(numero) + "\n");
	}

	public String decimalParaHexa(int numero) {

		Stack<Integer> pilha = new Stack<>();
		String numBinario = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0) {
			resto = numero % 16;
			pilha.push(resto);
			numero /= 16;
		}

		while (!pilha.isEmpty()) {
			numBinario += bases.charAt(pilha.pop());
		}

		return numBinario;
	}

	public void imprimeDecimalParaHexa(int numero) {
		System.out.println("\n" + numero + " em hexadecimal é: " + decimalParaHexa(numero) + "\n");
	}

	public String binarioParaHexa(String numeroBinario) {

		int iteracao = 0;
		int num = 0;
		String numHexadecimal = "";
		String bases = "0123456789ABCDEF";

		for (int i = numeroBinario.length() - 1; i >= 0; i--) {
			char c = numeroBinario.charAt(i);

			if (c == '1') {
				num += Math.pow(2, iteracao);
			}

			iteracao++;

			if (iteracao > 3 || i == 0) {
				iteracao = 0;
				numHexadecimal = bases.charAt(num) + numHexadecimal;
				num = 0;
			}
		}

		return numHexadecimal;
	}

	public void imprimeBinarioParaHexa(String numeroBinario) {
		System.out.println("\n" + numeroBinario + " em hexadecimal é: " + binarioParaHexa(numeroBinario) + "\n");
	}

}