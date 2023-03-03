package logica;

import br.com.softblue.commons.io.Console;

public class DoWhile {

	public static void main(String[] args) {
		
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a nota " + cont + ":");
			nota = Console.readDouble();
			// cont = cont + 1;
			cont++;
			
			if (nota != -1) {
			//soma = soma + nota;
			soma += nota;
			System.out.println("(Soma =" + soma + ")");
			}
			
		} while (nota != -1); 	
		
		Double media= soma / (cont - 2);
		
		System.out.println("Media = " + media);
	}

}
