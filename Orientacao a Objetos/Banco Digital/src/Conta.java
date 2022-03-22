
public class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {

		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;

	}
	
	public void sacar(double valor) {
		
		if (valor > saldo) System.out.println("Saldo Insuficiente para o Valor Solicitado\n");
		else this.saldo -= valor;	
		
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		
		if (valor > saldo) System.out.println("Saldo Insuficiente para a Transferência Solicitada\n");
		else { 
			
			this.saldo -= valor;
			this.sacar(valor);
			contaDestino.depositar(valor);
			
		}
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfoComuns() {
		
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public void imprimirExtrato1() {
		
	}

	public void imprimirExtrato2() {
		
	}

}
