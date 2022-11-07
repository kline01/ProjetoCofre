package empresa;

import java.util.ArrayList;

public class Dolar extends Moeda{

		
	public  Dolar(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Dolar - " + valor);
	}
	public double converter() {
		double valorConvertido;
		return valorConvertido = valor*5.08; //O dolar atualmente está 5,08 06/11/2022

		
		
	}
	
}