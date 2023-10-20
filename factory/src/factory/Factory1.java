package factory;

public class Factory1 extends Factory {
	protected Produit createProduit() {
		return new ProduitA();
	}

}
