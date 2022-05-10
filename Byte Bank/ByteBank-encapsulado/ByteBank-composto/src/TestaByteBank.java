
public class TestaByteBank {
	public static void main(String[] args) {
		Conta contaLuis = new Conta();
		contaLuis.titular = new Cliente();
		contaLuis.titular.nome = "Luis Felipe Rodrigues Lima";
		System.out.println(contaLuis.titular.nome);
	}

}
