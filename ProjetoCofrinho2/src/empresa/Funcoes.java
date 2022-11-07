package empresa;
import java.util.Scanner;
public class Funcoes extends Principal {
	public static void adicionarMoeda() {
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
	}
}
