package exercicio.conta;

public class Conta {

	//atributos
	String titular;
	double saldo;
	//fim atributos
	
	
	//metodos construtores
	 
//	public Conta() {} //construtor vazio
	
	public Conta(String titular, double saldo) { //construtor com todos os atributos
		this.titular = titular; //passa o valor do construtor para o atributo da classe
		this.saldo = saldo; //passa o valor do construtor para o atributo da classe
	}
	
	//metodos
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	//fim metodos
	
}
