package desafio_Controle_de_Fluxo;

import java.util.Scanner;

public class Contador {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o parametroUm: ");
		int parametroUm = ler.nextInt();
		System.out.print("Digite o parametroDois: ");
		int parametroDois = ler.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Exceção: O parametroUm é maior que o parametroDois");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = 0;
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			contagem = parametroDois - parametroUm;
		}

		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println(i+1);
		}
	}
}