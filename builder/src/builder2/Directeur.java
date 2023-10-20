package builder2;

public class Directeur {
	
	public Pizza ConstruirepizzaReine() {
		Monteurpizza pizzaReine= new MonteurpizzaReine();
		
		return pizzaReine.getpizza();
		
	}
	public Pizza ConstruirepizzaPiquante() {
		Monteurpizza pizzaPiquante= new MonteurpizzaPiquante();
		
		return pizzaPiquante.getpizza();
		
	}
	public Pizza ConstruirepizzaDoux() {
		Monteurpizza pizzaDoux= new MonteurpizzaDoux();
		
		return pizzaDoux.getpizza();
		
	}
}
