package factory;

public class Factory3 extends Factory{
	protected Produit createProduit() {
		return new ProduitC();
	}
}
