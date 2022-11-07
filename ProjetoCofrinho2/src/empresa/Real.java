package empresa;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		;		
	}

	public double converter() {
		return valor; //como é moeda vigente, não há conversão
		
	}

}
