package money;

import java.util.ArrayList;

public class Dolar extends Moeda{
	public static double valor;
	
	public Dolar(Double valor) {;
	this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	public void info() {
		
	}
	public double converter() {
		double valorConvertido;
		return valorConvertido = valor*5.08; //O dolar atualmente está 5,08 06/11/2022

		
		
	}
	
}