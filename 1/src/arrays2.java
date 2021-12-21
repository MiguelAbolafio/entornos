import java.util.Scanner;
public class arrays2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantidad=100;
		
		int [] numeros= new int[cantidad];
		
		for (int i = 0 ; i < numeros.length; i++){
					
			numeros[i]= (int)(Math.random()*100+1);
		}
			
			for (int i = 1; i<numeros.length ;i=i+2) {
				System.out.println("Posicion "+i+" "+numeros[i]);
			}
			sc.close();
	}

}