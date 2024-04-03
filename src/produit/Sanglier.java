package produit;

import personnages.Gaulois;
import produit.Produit; 

public class Sanglier extends Produit {
	private int poids; 
	private Gaulois chasseur; 
	
	
	public void decrireProduit() {
		System.out.println("Sanglier peché mardi");
	}

	public Sanglier(String unité, int poids, Gaulois chasseur) {
		super("sanglier", unité); 
		this.poids = poids; 
		this.chasseur = chasseur; 
	}
	
	
}
