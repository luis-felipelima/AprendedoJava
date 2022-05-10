
public class TestaSaca {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}
}
