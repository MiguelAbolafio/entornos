import java.util.Scanner;
public class crecimientopoblacion {
	public static void main(String[] args) {
		
		int crecimientoanual,años,poblacion,resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la poblacion actual");
		poblacion=teclado.nextInt();
		
		System.out.println("introduce el crecimiento anual");
		crecimientoanual=teclado.nextInt();
		
		System.out.println("introduce el nº de años que quieres que pasen");
		años=teclado.nextInt();
		
		resultado=(poblacion+(crecimientoanual*años));
		
		System.out.println("La población paso de ser "+poblacion+" millones a "+resultado+" millones en "+años+" años co una tasa de crecimiento de "+crecimientoanual+" millones al año");
		
		teclado.close();
	}

}
