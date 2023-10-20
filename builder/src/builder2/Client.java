package builder2;

public class Client {

		public static void main(String[] args) {
		Directeur directeur = new Directeur();
		
	directeur.ConstruirepizzaPiquante()
.print();
	System.out.println("\n");
	directeur.ConstruirepizzaReine()
.print();

	System.out.println("\n");
	directeur.ConstruirepizzaDoux()
.print();
	}
		

}
