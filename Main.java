public class Main{

	double n, suma, k;
	
	public static void main(String[] args){
		System.out.println("Suma pares hasta n." + " Ingrese n: " );		

		leer(n);		

		suma = 0.0;

		for(int k = 2; k < n; k+=2){
			suma = suma+k;

			}

		System.out.println("La suma es " + suma );		

	}

}
