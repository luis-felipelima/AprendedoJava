
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		
		Conta contaDois = new Conta();
		contaDois.saldo = 100;
		contaDois.transfere(200, conta);
		System.out.println("Saldo conta 1: " + conta.saldo);
		System.out.println("Saldo conta 2: " + contaDois.saldo);
	}
}
