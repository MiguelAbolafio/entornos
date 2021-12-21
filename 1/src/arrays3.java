import java.util.Scanner;
public class arrays3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantidad=20,contador=0;
		double acumulador=0;
		
		double [] notas= new double[cantidad];
		
		for (int i = 0 ; i < notas.length; i++){
					
			
			
			notas[i]=Math.random()*10;
			acumulador += notas[i];
		}
			acumulador=acumulador/cantidad;
		
			for (int i =0; i<notas.length ; i++) {
				if(notas[i]>=acumulador) {
					contador++;
				}
				System.out.println(contador);
			}
			sc.close();
	}

}