package builder1;

public class MonteurpizzaDoux extends  Monteurpizza{
	public Pizza getpizza() {return pizza;}
	
	 public void monterpate() { pizza.setpate("macabo"); }
	 public void montersauce() { pizza.setsauce("sauce jaune"); }
	 public void montergarniture() {
	pizza.setgarniture("feuille de macabo"); }

}
