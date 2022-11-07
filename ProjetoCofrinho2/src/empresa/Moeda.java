package empresa;

public abstract class Moeda {

	static double valor;
	private String nome;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public abstract void info();
	public abstract double converter();	
}
