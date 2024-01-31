package br.com.ag;
import java.util.Scanner;

public class ConverteWrapper {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        int numeroPrimitivo = scanner.nextInt();
        
        Integer numeroWrapper = numeroPrimitivo;

        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);

      
            scanner.close();
	
	}

}
