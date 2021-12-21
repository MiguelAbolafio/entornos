import java.util.Scanner;
public class cajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int saldo=(int)(Math.random()*10000+100);
			int opciones;
			System.out.println("¿Que opción deseas realizar?");
			System.out.println("Introduce 1 para cuanto sacar 2 para consultar 3 meter");
			System.out.println(saldo);
			opciones=sc.nextInt();
			switch (opciones) {
			case 1:
			
				System.out.println("¿Cuanto dinero quieres retirar?");
				int cuanto = sc.nextInt();
					if(cuanto>0 && saldo>=cuanto) { 
						saldo=cuanto;
						System.out.println("operacion realizada");
					
						
					}else System.out.println("no tienes "+cuanto+" $");
				break;
				
			case 2:
				System.out.println("tu saldo es "+saldo+" $");
				break;
				
			case 3:
				System.out.println("Cuanto quieres introducir?");
				
				int meter=sc.nextInt();
				
					if (meter>0) {
						saldo+=meter;
							System.out.println("has introducido "+meter+" Y ahora tienes "+saldo);
								}
				break;
			default:
				System.out.println("opcion incorrecta");
				
				sc.close();
			}
			System.out.println("fin");
			
			
	}	

}
