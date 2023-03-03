package logica;

import br.com.softblue.commons.io.Console;

public class While {

	public static void main(String[] args) {
		
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		while (true) {
			System.out.println("Digite a nota " + cont + ":");
			nota = Console.readDouble();
			
			if (nota == -1) {
				cont--;
				break;
			}
			
			cont++;
			soma += nota;
			System.out.println("(Soma = " + soma + ")");			
		}
		
		Double media = soma / cont;
		System.out.println("Media =" + media);
	}
}
