package builder;

public class Directeur {
	
	private Monteurpizza monteurpizza;
	public void setMonteurpizza(Monteurpizza monteurpizza) {
		this.monteurpizza = monteurpizza;
	}
	public Pizza getpizza() {
		return monteurpizza.getpizza();
	}
	
	public void Construirepizza() {
		monteurpizza.createnouvellepizza();
		monteurpizza.monterpate();
		monteurpizza.montersauce();
		monteurpizza.montergarniture();
	}
}
