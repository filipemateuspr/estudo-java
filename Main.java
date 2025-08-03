package estudo.java;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static int userChoice = 0;
	
	public static void main(String[] args) {
		showMainMenu();
	}
	
	private static void showMainMenu() {
		boolean isValidChoice = false;
		
		System.out.print("Bem-vindo ao código com os exercícios da lista 1. Por Filipe Mateus.");
		
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
				break;
			case 2:
				break;
		}
	}
}
