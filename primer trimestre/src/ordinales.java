import java.util.Scanner;
public class ordinales {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String mes;
		
		
		System.out.println("introduce el numero del mes que quieres consultar sus dias");
		mes=teclado.next();
		
		switch(mes) {
		case "1":
			System.out.println("Enero tiene 31 d�as");
		break;
		case "2":
			System.out.println("Febrero tiene 28 d�as");
		break;
		case "3":
			System.out.println("Marzo tiene 30 d�as");
		break;
		case "4":
			System.out.println("Abril tiene 31 d�as");
		break;
		case "5":
			System.out.println("Mayo tiene 31 d�as");
		break;
		case "6o":
			System.out.println("Junio tiene 30 d�as");
		break;
		case "7":
			System.out.println("Julio tiene 31 d�as");
		break;
		case "8":
			System.out.println("Agosto tiene 31 d�as");
		break;
		case "9":
			System.out.println("Septiembre tiene 30 d�as");
		break;
		case "10":
			System.out.println("Octubre tiene 31 d�as");
		break;
		case "11":
			System.out.println("Noviembre tiene 30 d�as");
		break;
		case "12":
			System.out.println("Diciembre tiene 31 d�as");
		break;
		}
		teclado.close();
	}
	
}
