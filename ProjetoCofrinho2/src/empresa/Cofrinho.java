package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList();
	Iterator<Moeda> it = moedas.iterator();
	
	public void add(Moeda m) {
		moedas.add(m);
	}
	public void remove(Moeda m) {
		moedas.remove(m);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Moeda m : moedas) {
			total += m.getValor();
		}
		return total;
		
	}
	
	public void info() {
		for(int n = 0; it.hasNext(); n+= 1) {
		System.out.println(moedas.get(n).toString());
		}
	}

	
}
