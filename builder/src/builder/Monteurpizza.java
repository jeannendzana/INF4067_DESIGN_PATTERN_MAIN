package builder;

public abstract class Monteurpizza {
	protected Pizza pizza;
	public void createnouvellepizza() { pizza = new Pizza();}
	
	public Pizza getpizza() {
		createnouvellepizza();
		monterpate();
		montersauce();
		montergarniture();
		return pizza;}
	
	public abstract void monterpate();
	public abstract void montersauce();
	public abstract void montergarniture();
}
	
 
	


