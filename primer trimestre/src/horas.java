import java.util.Scanner;
public class horas {

	public static void main(String[] args) {
		
		int horas,dias,semanas,horasrestantes=0;
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta un numero total de horas");
		
		horas=teclado.nextInt();
		
		dias=horas/24;
		semanas=horas/164;
		
		if(horas>24) {
			horasrestantes=(horas-dias*24);	
		};

		
		
		System.out.println(horas+" horas son "+semanas+" semanas "+dias+" dias y "+horasrestantes+" horas restantes");
		
		teclado.close();
	}

}
