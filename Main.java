public class Main{

	double[] M3 = new double[3];
	double[] v = new double[6];
	double[] M = new double[5];
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
