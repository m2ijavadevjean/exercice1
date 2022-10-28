package exercice1.adresse;

import java.util.Scanner;

public class launcher {

	public static void main(String[] args) {
		Scanner monScanner = new Scanner(System.in);
		
		System.out.println("Entrez votre adresse?");
		
		System.out.println("Quel est votre numéro de rue?");
		String numRue = monScanner.nextLine();
		System.out.println("Quel est votre rue?");
		String rue = monScanner.nextLine();	
		System.out.println("Entrer votre code postal");
		int codePostal = monScanner.nextInt();
		System.out.println("Votre adresse est : " + numRue + " " + rue + " "+ codePostal);
		
		//System.out.println("Votre adresse est : " + monAdresse);
	}
	

}
