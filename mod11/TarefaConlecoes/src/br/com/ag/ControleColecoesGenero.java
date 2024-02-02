package br.com.ag;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ControleColecoesGenero {

	public static void main(String[] args) {
		
		System.out.println("Digite os nomes separados por vírgula (,):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] nomesArray = input.split(",\\s*"); // Pode ter espaços após a vírgula
        
        ArrayList<String> nomes = new ArrayList<>();
        Collections.addAll(nomes, nomesArray);
        	
        Collections.sort(nomes);
        
        
    
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        
        for (int i =0; i < nomes.size(); i++) {
        	String pessoa = nomes.get(i);
            String[] partes = pessoa.split("\\s*-\\s*");
            String nome = partes[0];
            String genero = partes[1];
            
            genero = genero.toUpperCase();
            if (genero.equals("M")) {
                homens.add(nome);
            } else if (genero.equals("F")) {
                mulheres.add(nome);
            }
        }
        
        System.out.println("Homens:");
        for (int i =0; i < homens.size(); i++) {
            System.out.println("   " + homens.get(i));
        }

        System.out.println("\nMulheres:");
        for (int i =0; i < mulheres.size(); i++) {
            System.out.println("   " + mulheres.get(i));
        }
        scanner.close();
	}
}
