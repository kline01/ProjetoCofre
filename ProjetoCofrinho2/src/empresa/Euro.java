package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	@Override
	public  void info() {
	} 

	public double converter() {
		// TODO Auto-generated method stub
		double valorConvertido;
		return valorConvertido = valor*5.05; //O Euro atualmente está 5,05 06/11/2022
	}
}
