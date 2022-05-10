
public class testaCondicional {
	public static void main(String[] args) {
		int idade = 16;
		int idadeAcompanhante = 17;
		int quantidadePessoas = 3;
		System.out.println("teste");
		if (idade >= 18) {
			System.out.println("você é maior de idade, pode entrar");
		} else if (quantidadePessoas >= 2 && idadeAcompanhante >= 18){
			System.out.println("Vocé é menor de idade, mas está acompanhado, pode entrar");
		}else {
			System.out.println("você é menor de idade e está sem um acompanhante maior de idade");
		}
	}
}
