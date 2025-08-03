package estudo.java;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
	
	private static final String[] EXERCISE_STATEMENTS = new String[]{
		"Um táxi cobra uma tarifa fixa de R$ 5,00 mais R$ 2,50 por quilômetro rodado.\nEscreva um programa que leia a distância percorrida e calcule o valor total da corrida.",
		"Escreva um programa que leia a quantidade de dias de um mês e calcule o total de minutos nesse período.",
		"Escreva um programa que leia o valor original de um produto e aplique dois descontos sequenciais:\no primeiro de 10%, e o segundo de 5% sobre o valor já com desconto.",
		"Um mercado vende garrafas de água por R$ 1,50 cada se forem compradas menos de 6 unidades. Se forem compradas 6 ou mais, o preço unitário cai para R$ 1,20.\nEscreva um programa que leia a quantidade de garrafas compradas, calcule e mostre o valor total da compra.",
		"Cada ingresso para o cinema custa R$ 30,00. Clientes que têm carteirinha de estudante ou têm menos de 18 anos pagam meia-entrada.\nEscreva um programa que leia a idade do cliente e se ele possui carteirinha (1 para sim, 0 para não) e calcule o valor a ser pago.",
		"Escreva um programa que leia 4 números inteiros digitados pelo usuário e, ao final, mostre a soma total desses números.",
		"Escreva um programa que leia 4 números e mostre quantos deles são negativos."
	};
	private static Scanner scanner = new Scanner(System.in);
	private static int userChoice = 0;
	
	public static void main(String[] args) {
		System.out.print("Bem-vindo ao código com os exercícios da lista 1. Por Filipe Mateus.");
		showMainMenu();
	}
	
	private static void showMainMenu() {
		boolean isValidChoice = false;
		
		do {
			System.out.print("\n=====| EXERCÍCIOS LISTA 1 |====="
					 + "\n1 - Executar exercício 01"
					 + "\n2 - Executar exercício 02"
					 + "\n3 - Executar exercício 03"
					 + "\n4 - Executar exercício 04"
					 + "\n5 - Executar exercício 05"
					 + "\n6 - Executar exercício 06"
					 + "\n7 - Executar exercício 07"
					 + "\n8 - Encerrar execução");
			System.out.print("\nDigite um número correspondente a opção desejada: ");
			
			userChoice = scanner.nextInt();
			
			if (userChoice <= 0 || userChoice > 8) {
				System.err.print(MessageFormat.format("{0} não é uma opção válida. Por favor, tente novamente.", userChoice));
			} else {
				isValidChoice = true;
			}
		} while (!isValidChoice);
		
		switch (userChoice) {
			case 1:
				System.out.println(getExerciseStatement(1));
				break;
			case 2:
				System.out.println(getExerciseStatement(2));
				break;
			case 3:
				System.out.println(getExerciseStatement(3));
				break;
			case 4:
				System.out.println(getExerciseStatement(4));
				break;
			case 5:
				System.out.println(getExerciseStatement(5));
				break;
			case 6:
				System.out.println(getExerciseStatement(6));
				break;
			case 7:
				System.out.println(getExerciseStatement(7));
				break;
		}
	}
	
	private static String getExerciseStatement(int index) {
		String foundStatement = "Enunciado não encontrado.";
		
		for (int i = 0; i < EXERCISE_STATEMENTS.length; i++) {
			if (index == i + 1) foundStatement = EXERCISE_STATEMENTS[i];
		}
		
		return foundStatement;
	}
}
