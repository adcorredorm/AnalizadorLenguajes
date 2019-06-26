public class Main{

	double[] M3 = new double[3][5][2];
	double[] v = new double[6];
	double[] M = new double[5][7];
	String[] dias_sem = new String[7];
	public static void main(String[] args){
		cls();		
		imprimir_explicacion();		
		System.out.println("Numero entero? ");		

		// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:
		String n = sc.nextLine();
		String m = sc.nextLine();
		String asdf = sc.nextLine();
		
		calcular_suma(n);		
		System.out.println("\nLa suma de los primeros " + n  + "números enteros es "  + tot );		
	}

	public static void calcular_suma(double entero_tope){
		double k;
		tot = 0;		
		for(int k = 1; k < entero_tope; k++){
			tot = tot+k;			
		}		
	}

	public static void imprimir_explicacion(){
		System.out.println("\nEste programa de ejemplo calcula la suma de los enteros" + "\npositivos comprendidos entre 1 y un valor "  + "que se ingresa\n" );		
	}

	public static double entero(double n){
		double ent;
		ent = 0;		
		while(n>=1){
			ent = ent+1;			
			n = n-1;			
		}		
		return ent;
	}

	public static void mi_sub(double a, double b){
		a = 5;		
		b = b*5;		
		System.out.println("\n" + a  + " "  + b );		
	}

	public static void impr_vect(double v){
		double k;
		for(int k = 1; k < alen(v); k++){
			System.out.println(v[k] + j );			
		}		
	}

}
