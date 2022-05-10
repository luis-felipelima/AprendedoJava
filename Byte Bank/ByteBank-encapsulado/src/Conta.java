
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		System.out.println("Estou criando uma conta");
		setAgencia(agencia);
		setNumero(numero);
		Conta.total++;
		System.out.println("Total de contas é " + Conta.total);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= saldo) {
			this.saldo -= valor;
			return true;
		}
		else {
			System.out.println("Você não possui saldo suficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("Saldo insuficiente para transferencia");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não é permitido agencia com números negativos ou iguais a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não é permitido numero com números negativos ou iguais a 0");
			return;
		}
		this.numero = numero;
	}
	
	
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public static int getTotal() {
		return Conta.total;
	}
}
