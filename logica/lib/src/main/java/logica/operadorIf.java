package logica;

import br.com.softblue.commons.io.Console;

public class operadorIf {

	public static void main(String[] args) {
		
		System.out.println("Digite sua idade: ");
		int idade = Console.readInt();
		
		if (idade <= 12) {
			System.out.println("Você é criança!");
		} else {
			System.out.println("Você é adulto!");
		}
		System.out.println("Fim do programa!");
	}

}
