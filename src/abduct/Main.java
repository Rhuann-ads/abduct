package abduct;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double opcao1 = 59.90;
		double opcao2 = 350.00;
		double opcao3 = 250.00;
		int quantidade = 0;
		double total = quantidade * opcao1;
		int codigo;

		
		System.out.println("-------MENU--------");
		System.out.println("1- Oculos esporte");
		System.out.println("2- Oculos de grau");
		System.out.println("3- Oculos infantil");
		
		codigo = sc.nextInt();
		
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
		}else {
			System.out.println("Opção invalida!");
		}
		
		sc.close();
	}

}
