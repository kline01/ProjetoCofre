package money;

public class Real extends Moeda {
	public static double valor;
	
	public Real(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public void info() {
		
	}

	public double converter() {
		return valor; //como é moeda vigente, não há conversão
		
	}

}
