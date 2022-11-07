package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList();
	Iterator<Moeda> it = moedas.iterator();
	
	
	public void add(Moeda m) {
		moedas.add(m);
	}
	public void remove(double remove) {
		moedas.remove(remove);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Moeda m : moedas) {
			total += m.converter();
		}
	return total;
 }
	
	public void info() {
		int n = 0;
		while(n < moedas.size()) {
			System.out.println( moedas.get(n).getClass() + "|" + moedas.get(n).getValor());
			n += 1;
		}
		}
	
	}

	
