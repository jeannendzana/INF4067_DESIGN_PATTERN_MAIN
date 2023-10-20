package builder2;

public class MonteurpizzaPiquante extends Monteurpizza{

		
		 public void monterpate() { pizza.setpate("feuilletee"); }
		 public void montersauce() { pizza.setsauce("piquante"); }
		 public void montergarniture() {
		pizza.setgarniture("pepperoni+salami"); }

			public Pizza getpizza() {
				createnouvellepizza();
				monterpate();
				montersauce();
				montergarniture();
				return pizza;}

}



