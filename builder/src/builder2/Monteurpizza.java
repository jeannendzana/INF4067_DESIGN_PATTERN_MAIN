package builder2;

public abstract class Monteurpizza {
	protected Pizza pizza;
	public void createnouvellepizza() { pizza = new Pizza();}
	
	public abstract Pizza getpizza();
	
	public abstract void monterpate();
	public abstract void montersauce();
	public abstract void montergarniture();
}
	
 
	


