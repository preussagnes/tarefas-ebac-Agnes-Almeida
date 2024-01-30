package br.com.ag;
import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número");
        int primeiroNumero = scanner.nextInt();
        
        System.out.println("Digite o Segundo Número");
        int segundoNumero = scanner.nextInt();
        
        System.out.println("Digite o Terceiro Número");
        int terceiroNumero = scanner.nextInt();
        
        System.out.println("Digite o Quarto Número");
        int quartoNumero = scanner.nextInt();

        double media = 0;

        	media = (primeiroNumero+ segundoNumero + terceiroNumero + quartoNumero)/4;
        	
        	System.out.println("A média dos números é: " + media);

            scanner.close();
	
	}

}
