public class testandoCondicional2 {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 2;
		int idadeAcompanhante = 18;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("");
		System.out.println(acompanhado);
		System.out.println("");
		
		if (idade >= 18) {
			System.out.println("você é maior de idade, pode entrar");
		} else if (acompanhado == true && idadeAcompanhante >= 18){
			System.out.println("Vocé é menor de idade, mas está acompanhado, pode entrar");
		}else {
			System.out.println("você é menor de idade e está sem um acompanhante maior de idade");
		}
	}
}
