package money;

import java.util.Scanner;

public class Principal {

	public static  Scanner teclado = new Scanner(System.in); //instanciando Scanner e a classe Cofrinho globalmente
	public static  Cofrinho c = new Cofrinho();
	
	public static void main(String[] args) {
	int op = 0;	
	System.out.println("Programa de Kevin Soares RU: 4120427");
	
			do { //print com o 'menu' do programa.
		
				System.out.printf("\n");
				System.out.println("Menu");
				System.out.println("[1] - Adicionar Moeda");
				System.out.println("[2] - Remover Moeda");
				System.out.println("[3] - Lista de Moedas");
				System.out.println("[4] - Calcular Total");
				System.out.println("[5] - Sair do programa");
				op = teclado.nextInt(); //entrada para as opções do switch case
				switch (op) {
					case 1://menu para adicionar moeda
						System.out.println("------------");
						System.out.println("Qual moeda deseja adicionar?");
						System.out.println("[1] - Dolar");
						System.out.println("[2] - Euro");
						System.out.println("[3] - Real");
						Funcoes.adicionarMoeda(); //feita na classe 'Funções'
						break;
					case 2://menu para remover moeda
						System.out.println("------------");
						Cofrinho.removeExibir();

					case 3://menu para exibir a lista de moedas
						System.out.println("------------");
						c.info();
						break;
					case 4://menu para calcular o total
						c.calcularTotal();
					case 5://parar o programa
						break;
				}
		}while(op != 5);
	}
}

