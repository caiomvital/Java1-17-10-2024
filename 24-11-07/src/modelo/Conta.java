package modelo;

public class Conta {

	private String titular;
	private double saldo;

	public Conta(String titular) {
		this.titular = titular;
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta() {

	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	

}
