package models;

public class client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Produit produit = null;
		
		produit = factory.getproduit(Factory.type_produitA);
		produit.methode();
		
		produit = factory.getproduit(Factory.type_produitB);
		produit.methode();
		produit = factory.getproduit(3);
		produit.methode();

	}

}
