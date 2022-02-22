import java.util.Scanner;
public class imc {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double altura,peso,imc;
		
		System.out.println("introduce tu altura");
		altura=teclado.nextDouble();
		System.out.println("introduce tu peso");
		peso=teclado.nextDouble();
		
		imc = peso/(altura*altura);
		System.out.print("tu altura es: "+altura);
		System.out.print("cm tu peso es : "+peso);
		System.out.println("kg tu imc es : "+(Math.round(imc)));
		
	
		
		teclado.close();
	}
	}


