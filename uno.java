public class uno{

	double n, suma, k;
	
	public static void main(String[] args){
		imprimir("\nSuma de numeros pares entre 1 y n.\nPor favor ","ingrese un valor para n: ");		

		leer(n);		

		suma = 0;

		for(int k = 2; k < n; k+=2){
			suma = suma+k;

			}

		imprimir("\nLa suma es ",suma);		

	}

}
