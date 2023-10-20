package builder1;

public abstract class Monteurpizza {
	protected Pizza pizza;
	
	public Pizza getpizza() {return pizza;}
	public void createnouvellepizza() { pizza = new Pizza();}
	public abstract void monterpate();
	public abstract void montersauce();
	public abstract void montergarniture();
}
	
 
	


