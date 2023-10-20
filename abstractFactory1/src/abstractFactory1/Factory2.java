package abstractFactory1;

	public class Factory2 implements Factory{
		public ProduitA getProduitA() {
			return new ProduitA2();
		}
	public ProduitB getProduitB() {
		return new ProduitB2();
	}
}
