		import java.util.Scanner;
public class traductor {

	public static void main(String[] args) {
	
				Scanner teclado = new Scanner(System.in);
				 
			 String palabra;
				
			 System.out.println("introduce una letra");
				palabra=teclado.next();
				
				
				switch(palabra) {
				case "a":
					System.out.println("Enero tiene 31 días");
				break;
						
				
				}
				
			teclado.close();
	}

}
