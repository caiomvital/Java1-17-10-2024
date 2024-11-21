package exercicio;

import exercicio.conta.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
		
	}

	public void transferir(double valor, ContaPoupanca destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
}
