package produit;

public abstract class Produit implements IProduit {
	private String nom; 
	private String unité; 
	
	
	@Override
	public String getNomProduit(){
		return nom; 
	}
	
	@Override
	public abstract void decrireProduit();
	
	public Produit(String nom, String unité) {
		this.nom = nom; 
		this.unité = unité; 
		
	}
}
