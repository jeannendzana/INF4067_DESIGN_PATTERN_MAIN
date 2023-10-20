package factory;

public class Client {

	public static void main(String[] args) {
		Factory factory1 = new Factory1 ();
		Factory factory2 = new Factory2 ();
		
		Produit produit = null;
	
		System.out.println(" utlisation de la premiere fabrique");
		produit = factory1.getProduit();
		produit.Mproduit();

		System.out.println(" utlisation de la deuxieme fabrique");
		produit = factory2.getProduit();
		produit.Mproduit();

		
		

	}

}
