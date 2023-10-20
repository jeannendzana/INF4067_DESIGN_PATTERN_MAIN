package singleton.P;

public class Test {

	public static void main(String[] args) {
		int som = Singleton.getInstance( 2, 5).somme(2, 5);
		System.out.printf("la somme est :%d\n",som);
		
		float moy = Singleton.getInstance( 2, 5).moyenne(2, 5);
		System.out.printf("la moyenne est: %f",moy);
		
		Singleton s1 = Singleton.getInstance(8, 3);
		s1.affiche();
		Singleton s2 = Singleton.getInstance(5, 9);
		s2.affiche();

	}

}
