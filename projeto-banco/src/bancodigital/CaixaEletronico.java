package bancodigital;

public class CaixaEletronico {
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(joao);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
