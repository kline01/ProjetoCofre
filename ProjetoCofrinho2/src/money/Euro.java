package money;

public class Euro extends Moeda {
	public static double valor;
	
	public Euro(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	@Override
	public void info() {
	} 

	public double converter() {
		// TODO Auto-generated method stub
		double valorConvertido;
		return valorConvertido = valor*5.05; //O Euro atualmente está 5,05 06/11/2022
	}
}
