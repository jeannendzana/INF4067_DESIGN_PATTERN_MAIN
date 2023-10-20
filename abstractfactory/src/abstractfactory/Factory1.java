package abstractfactory;

public class Factory1 implements Factory{
	public ProduitA getProduitA() {
		return new ProduitA1();
	}
public ProduitB getProduitB() {
	return new ProduitB1();
}
}
