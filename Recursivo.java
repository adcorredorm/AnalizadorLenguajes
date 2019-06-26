public class Recursivo{

	double res;
	double x;
	public static void main(String[] args){

		// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:
		double x = Integer.parseInt(sc.nextLine());
		
		res = fact(x);		
		System.out.println(res);		
	}

	public static double fact(double valor){
		double rta;
		if(valor==0){
			rta = 1;			
		}else{
			rta = fact(valor-1);			
		}		
		return valor*rta;
	}

}
