package empresa;

import java.util.Scanner;

public class Principal {

	public static  Scanner teclado = new Scanner(System.in);
	public static  Cofrinho c = new Cofrinho();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
						Funcoes.adicionarMoeda();
						break;
					case 2:
						System.out.println("------------");
						System.out.println("Qual moeda deseja remover?");
						System.out.println("[1] - Dolar");
						System.out.println("[2] - Euro");
						System.out.println("[3] - Real");
						int opRemove = teclado.nextInt();
						switch (opRemove) {
						case 1:
							System.out.println("--US$--");
							System.out.println("Digite o valor que deseja remover: ");
							c.remove(teclado.nextDouble());
							break;
						case 2:
							System.out.println("--€uro--");
							System.out.println("Digite o valor que deseja remover: ");
							c.remove(teclado.nextDouble());					
							break;
						case 3:
							System.out.println("--Real(R$)--");
							System.out.println("Digite o valor que deseja remover: ");
							c.remove(teclado.nextDouble());					
							break;
						}
						
					case 3:
						System.out.println("------------");
						c.info();
					case 4:
						System.out.print(c.calcularTotal());
					case 5:
						break;
				}
		}while(op != 5);
	}
}

