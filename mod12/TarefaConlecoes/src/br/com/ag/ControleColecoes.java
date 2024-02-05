package br.com.ag;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ControleColecoes {

	public static void main(String[] args) {
		
		System.out.println("Digite os nomes separados por vírgula (,):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] nomesArray = input.split(",\\s*"); // Pode ter espaços após a vírgula
        
        ArrayList<String> nomes = new ArrayList<>();
        Collections.addAll(nomes, nomesArray);
        	
        Collections.sort(nomes);


        System.out.println("Nomes ordenados:");
        for (int i =0; i < nomes.size(); i++)
        {
            System.out.println(nomes.get(i));
		 }
        scanner.close();
	}
}
