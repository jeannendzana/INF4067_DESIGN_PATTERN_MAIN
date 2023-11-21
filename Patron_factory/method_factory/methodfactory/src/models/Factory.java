package models;

public class Factory {
	public static final int type_produitA = 1;
	public static final int type_produitB = 2;
	
	public Produit getproduit(int typeproduit) {
		Produit produit = null;
		switch (typeproduit) {
		case type_produitA:
			produit = new ProduitA();
			break;
		case type_produitB:
			produit= new ProduitB();
			break;
			default:
				throw new IllegalArgumentException("type de produit inconnu");
		}
		return produit;
	}
}
