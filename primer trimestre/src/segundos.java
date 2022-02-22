import java.util.Scanner;
public class segundos {

	public static void main(String[] args) {
		
		
		int segundos,minutos=0,horas=0;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce los segundos");
		segundos=teclado.nextInt();
		
		minutos=segundos/60;
		horas=segundos/3600;
		System.out.println("Hay "+segundos+" segundos, "+minutos+" minutos y "+horas+" horas");
		
		teclado.close();
	}
	

}
