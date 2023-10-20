package builder2;

public class MonteurpizzaReine extends Monteurpizza {
	
		 public void monterpate() { pizza.setpate("croisée"); }
		 public void montersauce() { pizza.setsauce("douce"); }
		 public void montergarniture() {
		pizza.setgarniture("jambon+champignon"); }

			public Pizza getpizza() {
				createnouvellepizza();
				monterpate();
				montersauce();
				montergarniture();
				return pizza;}

}
