package builder2;

public class MonteurpizzaDoux extends Monteurpizza{

		
		 public void monterpate() { pizza.setpate("feuille de banane"); }
		 public void montersauce() { pizza.setsauce("sauce jaune"); }
		 public void montergarniture() {
		pizza.setgarniture("escargot"); }

			public Pizza getpizza() {
				createnouvellepizza();
				monterpate();
				montersauce();
				montergarniture();
				return pizza;}

}



