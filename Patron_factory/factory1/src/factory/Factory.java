package factory;

public abstract class Factory {
	public Produit getProduit() {
		return createProduit();
	}
protected abstract Produit createProduit();
}