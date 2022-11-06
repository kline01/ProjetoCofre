package empresa;

public abstract class Moeda {

	double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public abstract void info();
	public abstract void converter();	
}
