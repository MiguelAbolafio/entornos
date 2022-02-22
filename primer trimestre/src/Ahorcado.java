import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		String PalabraSecreta = getPalabraSecreta();
		char [] PalabraGuiones = getGuionesFromPalabra(PalabraSecreta);
		boolean JuegoAcabado = false;
		Scanner sc = new Scanner(System.in);
		int intentos = 8;
		
		do {
			System.out.println("Te quedan " + intentos + " intentos");
			System.out.println(PalabraGuiones);
			System.out.println("Introduce una letra");
			char letra = sc.next().charAt(0);
			boolean AlgunaLetraAcertada = false;
			for(int i=0; i<PalabraSecreta.length(); i++) {
				if (PalabraSecreta.charAt(i) == letra) {
					PalabraGuiones[i] = letra;
					AlgunaLetraAcertada = true;
					
				}
			}
			if (!AlgunaLetraAcertada) {
				System.out.println("No has acertado ninguna letra");
				--intentos;
				if(intentos==0) {
					System.out.println("Has perdido porque agotaste los intentos");
					System.out.println("La palabra correcta era : " + PalabraSecreta);
					JuegoAcabado = true;
					
				}
			}
			else {
				boolean JuegoGanado = !HayGuiones(PalabraGuiones);
				if (JuegoGanado) {
					System.out.println("Has ganado el juego");
					System.out.println("La palabra es : " + PalabraSecreta);
					JuegoAcabado = true;
				}
			}
		}while(!JuegoAcabado);
		sc.close();
	}
		static String getPalabraSecreta() {
		String[] palabras = {"marvel", "hulk", "capi", "viuda", "ronin", "hawkeye", "gamora", "thor", "loki", "spiderman", 
				"groot", "rocket", "drax", "vision", "falcon", "strange", "avispa"};
		Random r = new Random();
		int n = r.nextInt(palabras.length);
		return palabras[n];
	}
	
	static char[] getGuionesFromPalabra(String palabra) {
		int nLetrasPalabraSecreta = palabra.length();
		char[] PalabraGuiones = new char[nLetrasPalabraSecreta];
		for (int i=0; i<PalabraGuiones.length; i++) {
			PalabraGuiones[i] = '_';
		}
		
		return PalabraGuiones;
	}
	static boolean HayGuiones(char[] array) {
		for(char l:array) {
			if(l=='_')return true;
		}
		return false;
	}

}
