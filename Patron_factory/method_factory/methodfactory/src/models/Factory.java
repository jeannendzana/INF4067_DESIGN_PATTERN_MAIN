package models;

public class Factory {
	public static final int type_produitA = 1;
	public static final int type_produitB = 2;
	public static final int type_produitC = 3;
	
	public Produit getproduit(int typeproduit) {
		Produit produit = null;
		switch (typeproduit) {
		case type_produitA:
			produit = new ProduitA();
			break;
		case type_produitB:
			produit= new ProduitB();
			break;
		case type_produitC:
			produit = new ProduitC();
			break;
			default:
				throw new IllegalArgumentException("type de produit inconnu");
		}
		return produit;
	}
}
