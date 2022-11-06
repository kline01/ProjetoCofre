package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cofrinho c = new Cofrinho();
		int op;

	
			do { 
		
				System.out.printf("-\n");
				System.out.println("Menu");
				System.out.println("[1] - Adicionar Moeda");
				System.out.println("[2] - Remover Moeda]");
				System.out.println("[3] - Lista de Moedas");
				System.out.println("[4] - Calcular Total");
				System.out.println("[5] - Sair do programa");
				op = teclado.nextInt();
				switch (op) {
					case 1:
						System.out.println("------------");
						System.out.println("Qual moeda deseja adicionar?");
						System.out.println("[1] - Dolar");
						System.out.println("[2] - Euro");
						System.out.println("[3] - Real");
						int opMoeda = teclado.nextInt();
						switch (opMoeda) {
							case 1:
								System.out.println("--US$--");
								System.out.println("Digite o valor: ");
								c.add(new Dolar(teclado.nextDouble()));
								System.out.println("Adicionada com sucesso.");
								break;
							case 2:
								System.out.println("--€uro--");
								System.out.println("Digite o valor: ");
								c.add(new Euro(teclado.nextDouble()));
								System.out.println("Adicionada com sucesso.");
								break;
							case 3:
								System.out.println("--Real(R$)--");
								System.out.println("Digite o valor: ");
								c.add(new Real(teclado.nextDouble()));
								System.out.println("Adicionada com sucesso.");
								break;	
							}
					case 2:
						System.out.println("------------");
						System.out.println("Qual moeda deseja remover?");
						System.out.println("[1] - Dolar");
						System.out.println("[2] - Euro");
						System.out.println("[3] - Real");
						int opRemove = teclado.nextInt();
						
					case 3:
					case 4:
					case 5:
						break;
				}
		}while(op != 5);
	}
}

