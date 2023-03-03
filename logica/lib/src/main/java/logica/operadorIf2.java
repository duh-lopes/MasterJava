package logica;

import br.com.softblue.commons.io.Console;

public class operadorIf2 {

	public static void main(String[] args) {
		
		System.out.println("Digite sua idade: ");
		int idade = Console.readInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("Você é CRIANÇA");
			
		} else if (idade > 12 && idade <= 17) {
			System.out.println("Você é ADOLESCENTE");
			
		} else if (idade > 17 && idade < 59) {
			System.out.println("Você é ADULTO");
			
		} else if (idade > 59) {
			System.out.println("Você é IDOSO");
		}
		
		System.out.println("Fim do Programa!");
	}

}
