
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(14578, 333);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Cliente luis = new Cliente();
		conta.setTitular(luis);
		luis.setNome("Luis Felipe Rodrigues Lima");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Conta contaDois = new Conta(2457, 369);
		System.out.println(Conta.getTotal());
	}
}
