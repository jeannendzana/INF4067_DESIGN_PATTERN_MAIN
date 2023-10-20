package factory;

public class Factory2 extends Factory{
	protected Produit createProduit() {
		return new ProduitB();
}

}

