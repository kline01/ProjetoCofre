package money;
public class Funcoes extends Principal {
	public static void adicionarMoeda() {
	int opMoeda = teclado.nextInt(); //entrada para o menu de escolher a moeda
	switch (opMoeda) {
		case 1:
			System.out.println("--US$--");
			System.out.println("Digite o valor: ");
			c.add(new Dolar(teclado.nextDouble()));//entrada de double para criar a nova moeda
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
