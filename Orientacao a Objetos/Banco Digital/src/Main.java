
public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.imprimirExtrato1();
		cp.imprimirExtrato2();
		
	}

}