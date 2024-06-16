import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("123.456.789-10");

		Cliente ana = new Cliente();
		ana.setNome("Ana");
		ana.setCpf("987.654.321-20");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(ana);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		List<Conta> contas= new ArrayList<Conta>();
		contas.add(cc);
		contas.add(poupanca);
		Banco banco = new Banco();
		banco.getClientes(contas);
	}

}
