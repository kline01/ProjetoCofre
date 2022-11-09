package money;

public abstract class Moeda {

	static double valor;
	

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public abstract void info();
	public abstract double converter();	
}
