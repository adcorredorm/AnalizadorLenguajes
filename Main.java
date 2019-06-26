public class Main{

	double[] arr = new double[5];
	double aux, aux2;
	final double min = 0;	
	final double max = 1;	
	final String prom = "Ingrese el tamaño";	
	
	public static void main(String[] args){
		System.out.println(prom);		

		// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:
		double size = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < size; i++){

			// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:
			double aux = Integer.parseInt(sc.nextLine());
			
			arr[i] = aux;			
		}		
		System.out.println("Elija su opcion: 0 si es minimo y 1 si es maximo");		

		// Import Scanner from java.io and initialize an instance 'sc' for the following inputs:
		double opcion = Integer.parseInt(sc.nextLine());
		
		if(opcion==min){
			aux = 1;			
			aux2 = arr[0];			
			do{
				if(aux2<arr[aux]){
					aux2 = arr[aux];					
				}				
			}while(aux==size);
			
		}else{
			aux = 1;			
			aux2 = arr[0];			
			while(aux<size){
				if(aux2>arr[aux]){
					aux2 = arr[aux];					
				}				
			}			
		}		
		System.out.println(aux2);		
	}

}
