package abstractFactory1;

public class Client {

	public static void main(String[] args) {
		Factory factory1 = new Factory1();
		Factory factory2 = new Factory2();
	
		
		ProduitA produitA = null;
		ProduitB produitB = null;
		
		System.out.println("utilisation de la premiere fabrique");
		produitA = factory1.getProduitA();
		produitB= factory1.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
		
		System.out.println("utilisation de la deuxieme fabrique");
		produitA = factory2.getProduitA();
		produitB= factory2.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
		
		
		// TODO Auto-generated method stub

	}

}
