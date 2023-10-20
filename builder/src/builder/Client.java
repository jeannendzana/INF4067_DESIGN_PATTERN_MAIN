package builder;

public class Client {

		public static void main(String[] args) {
		Directeur directeur = new Directeur();
		MonteurpizzaReine monteurReine = new MonteurpizzaReine();
		MonteurpizzaPiquante monteurPiquante = new MonteurpizzaPiquante();
		
		directeur.setMonteurpizza(monteurReine);
		directeur.Construirepizza();
		Pizza pizzaReine = directeur.getpizza();
		System.out.println("Pizza reine :" + pizzaReine);
		
		directeur.setMonteurpizza(monteurPiquante);
		directeur.Construirepizza();
		Pizza pizzaPiquante = directeur.getpizza();
		System.out.println("Pizza piquante :" + pizzaPiquante);




	}

}
