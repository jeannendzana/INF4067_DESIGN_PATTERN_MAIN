package abstractfactory;

	public class Factory3 implements Factory{
		public ProduitA getProduitA() {
			return new ProduitA3();
		}
	public ProduitB getProduitB() {
		return new ProduitB3();
	}
}
