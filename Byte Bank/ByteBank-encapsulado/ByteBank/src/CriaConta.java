
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.numero);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;
		System.out.println(segundaConta.saldo);
		segundaConta.saldo += 500;
		System.out.println(segundaConta.saldo);
		
	}
}
