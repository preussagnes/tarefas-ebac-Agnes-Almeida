package br.com.ag;
import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		
		long media;
        
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int primeiroNumero = scanner.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        int segundoNumero = scanner.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        int terceiroNumero = scanner.nextInt();
        
        System.out.println("Digite a quarta nota: ");
        int quartoNumero = scanner.nextInt();
        
        media = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero)/4;
        
        if (media >= 7){
        	System.out.println("Média do aluno: " + media + " Aprovado");
        }
        else if (media >=5) {
        	System.out.println("Média do aluno: " + media + " Recuperação");
        }
        else {
        	System.out.println("Média do aluno: " + media + " Reprovado");
        }
        	
       
       scanner.close();
	
	}

}
