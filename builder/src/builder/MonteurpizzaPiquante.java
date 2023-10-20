package builder;

public class MonteurpizzaPiquante extends Monteurpizza{

		public Pizza getpizza() {return pizza;}
		
		 public void monterpate() { pizza.setpate("feuilletee"); }
		 public void montersauce() { pizza.setsauce("piquante"); }
		 public void montergarniture() {
		pizza.setgarniture("pepperoni+salami"); }

}



