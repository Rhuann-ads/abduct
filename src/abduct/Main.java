package abduct;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double opcao1 = 59.90;
		double opcao2 = 350.00;
		double opcao3 = 250.00;
		int quantidade = 0;
		double total = quantidade * opcao1;

		
		menu(sc, opcao1, opcao2, opcao3);
		
		
		sc.close();
	}

	private static void menu(Scanner sc, double opcao1, double opcao2, double opcao3) {
		int quantidade;
		double total;
		int codigo = 0;
		System.out.println("-------MENU--------");
		System.out.println("1- Oculos esporte");
		System.out.println("2- Oculos de grau");
		System.out.println("3- Oculos infantil");
		
		try {
	    	 codigo = sc.nextInt();
	        } catch (NoSuchElementException | IllegalStateException e) {
	        	System.out.println("Opção invalida!");
	        }

		
		if(codigo == 1) {
			System.out.println("Quantos oculos esportes? ");
			quantidade = sc.nextInt();
			total = quantidade * opcao1;
			System.out.println("Você adquiriu " + quantidade + 
					" oculos esportes no valor de: R$" + total + " reais");
		}else if(codigo == 2) {
			System.out.println("Quantos oculos de grau? ");
			quantidade = sc.nextInt();
			total = quantidade * opcao2;
			System.out.println("Você adquiriu " + quantidade + 
					" oculos de grau no valor de: R$" + total + " reais");
		}else if(codigo == 3) {
			System.out.println("Quantos oculos infantil? ");
			quantidade = sc.nextInt();
			total = quantidade * opcao3;
			System.out.println("Você adquiriu " + quantidade + 
					" oculos infantil no valor de: R$" + total + " reais");
		}else{
			System.out.println("\nOpção invalida!\n");
			menu(sc, opcao1, opcao2, opcao3);
		}
	}

}
