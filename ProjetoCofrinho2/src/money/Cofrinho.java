package money;

import java.util.ArrayList;

public class Cofrinho extends Principal{
	public static ArrayList<Moeda> moedas = new ArrayList();

	
	//função void para adicionar moeda
	public void add(Moeda m) {
		moedas.add(m);
	}
	//função para exibir o menu de remover moeda
	public static void removeExibir() {
		System.out.println("----Digite o índice da moeda para remover----");
		int n = 0;
		for(Moeda m : moedas) { //loop em for para exibir as moedas disponíveis para remover
			System.out.println( "["+n+"] " + "|" + m.getValor() + moedas.get(n).getClass());  
			n += 1;
	}
		int opRemove = teclado.nextInt(); //a remoção da moeda e feita pelo seu índice no Array
		c.remove(opRemove);
		System.out.println("----Removido com sucesso.----");
	}
	//função void para remover moeda
	public void remove(int remove) { 
		moedas.remove(remove);
		}
	//função void para fazer o calculo do total
	public void calcularTotal() {
		double total = 0;
		for(Moeda m : moedas) {//loop em for para adicionar valores na variável total
			total += m.converter();
		}
	System.out.printf("%.2f",total);//printf para exibir valor total convertido
 }
	//função void para print lista de moedas
	public void info() { 
		int n = 0;
		for(Moeda m : moedas) { //loop em for para exibir as moedas do array
			System.out.println( moedas.get(n).getClass() + "|" + m.getValor()); 
			n++;  //print da classe para indicar qual moeda é
				
		}
		}
	
	}

	
