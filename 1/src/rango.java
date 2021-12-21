import java.util.Scanner;
public class rango {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura");
		int temperatura = sc.nextInt();
			
		if(temperatura<10) {
			System.out.println("frio");
		}else if(temperatura<26) {
			System.out.println("templado");
		}else if(temperatura<36) {
			System.out.println("caluroso");
			}else {System.out.println("clima tropial"); 
			
			}
				sc.close();
	}

}
