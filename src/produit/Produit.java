package produit;

public abstract class Produit implements IProduit {
	private String nom; 
	private String unit�; 
	
	
	@Override
	public String getNomProduit(){
		return nom; 
	}
	
	@Override
	public abstract void decrireProduit();
	
	public Produit(String nom, String unit�) {
		this.nom = nom; 
		this.unit� = unit�; 
		
	}
}
