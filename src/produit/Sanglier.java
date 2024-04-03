package produit;

import personnages.Gaulois;
import produit.Produit; 

public class Sanglier extends Produit {
	private int poids; 
	private Gaulois chasseur; 
	
	
	public void decrireProduit() {
		System.out.println("Sanglier pech� mardi");
	}

	public Sanglier(String unit�, int poids, Gaulois chasseur) {
		super("sanglier", unit�); 
		this.poids = poids; 
		this.chasseur = chasseur; 
	}
	
	
}
