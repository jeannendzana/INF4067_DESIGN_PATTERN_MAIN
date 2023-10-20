package arithmetique.P;


public final class Arithmetique {
	private static Arithmetique  instance = null;
	private int x;
	private int y;
	private Arithmetique (int x, int y) {
		
     this.x=x;
     this.y=y;
	}
	public static Arithmetique  getInstance(int x, int y) {
		if (instance == null) {
			instance = new
					Arithmetique (x,y);
		}
	return instance;
}
 public int addition(int x, int y) {
	 return x+y;
 }
 public int soustraction(int x, int y) {
	 return x-y;
 }
 public int multiplication(int x, int y) {
	 return x*y;
 }
 public double division(double x, double y) {
	 if(y == 0) {
		 throw new IllegalArgumentException("divion par zero impossible");
	 }
	 return x/y;
 }
 public void affiche() {
	 System.out.println("\nje suis une instance mes valeurs sont: x = "+ this.x + "et y =" + this.y);
 }
 @Override
 public Object clone() throws
 CloneNotSupportedException {
	throw new CloneNotSupportedException();
	 
 }

}



