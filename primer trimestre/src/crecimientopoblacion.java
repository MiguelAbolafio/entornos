import java.util.Scanner;
public class crecimientopoblacion {
	public static void main(String[] args) {
		
		int crecimientoanual,a�os,poblacion,resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la poblacion actual");
		poblacion=teclado.nextInt();
		
		System.out.println("introduce el crecimiento anual");
		crecimientoanual=teclado.nextInt();
		
		System.out.println("introduce el n� de a�os que quieres que pasen");
		a�os=teclado.nextInt();
		
		resultado=(poblacion+(crecimientoanual*a�os));
		
		System.out.println("La poblaci�n paso de ser "+poblacion+" millones a "+resultado+" millones en "+a�os+" a�os co una tasa de crecimiento de "+crecimientoanual+" millones al a�o");
		
		teclado.close();
	}

}
