package produit;

import produit.Produit;

public class Poisson extends Produit {
	private String dateDePeche; 
	private String nom = "poisson"; 
	
	public void decrireProduit() {
		System.out.println("Poisson chasser hier"); 
	}
	
	
	public Poisson(String unit�, String dateDePeche) {
		super("poisson", unit�); 
		this.dateDePeche = dateDePeche; 
	}
}
