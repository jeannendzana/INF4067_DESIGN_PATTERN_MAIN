package arithmetique.P;



public class Testarithmetique {

	public static void main(String[] args) {
		int addition = Arithmetique .getInstance( 7, 9).addition(7, 9);
		System.out.printf("l'addition est :%d\n",addition);
		int soustraction = Arithmetique .getInstance( 7, 9).soustraction (7, 9);
		System.out.printf("la soustraction est :%d\n",soustraction);
		int multiplication = Arithmetique .getInstance( 7, 9).multiplication (7, 9);
		System.out.printf("la multiplication est :%d\n",multiplication);

		double division = Arithmetique .getInstance( 7, 9).division(7, 9);
		System.out.printf("la division est: %f",division);
		
		Arithmetique  s1 = Arithmetique .getInstance(8, 3);
		s1.affiche();
		Arithmetique  s2 = Arithmetique .getInstance(5, 9);
		s2.affiche();

	}

}
