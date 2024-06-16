import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	// mETODO PARA BUSCAR TODOS OS CLIENTES DO BANCO
		// dECLARAR LISTA DE CLIENTES
	
	public void getClientes(List<Conta> contas){
		for (Conta conta : contas) {
			System.out.println(conta.cliente.getNome());
			System.out.println(conta.cliente.getCpf());
		}
		
	}
		
}
