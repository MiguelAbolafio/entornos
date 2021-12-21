import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantidad=2;
		
		int [] numeros= new int[cantidad];
		for (int i = 0 ; i < numeros.length; i++){
			System.out.println("introduce un número");
			numeros[i]=sc.nextInt();	
		}
			for (int i = numeros.length-1; i>-1 ;i--) {
				System.out.println(numeros[i]);
			}
			sc.close();
	}

}
