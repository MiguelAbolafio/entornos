import java.util.Scanner;
public class grados {

	public static void main(String[] args) {
	gradosoperador();

	}

	public static void gradosoperador() {
		double celcius,farenheit; 
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("introduce los farenheit");
			farenheit=teclado.nextInt();
			
			celcius=((farenheit-32)/1.8);
			System.out.println(farenheit+" farenheit son "+celcius+" celcius");
			
			teclado.close();
			
			//En 1 proyecto crea una tabla de eneteros de dos dimensiones de modo que la clase tiene 3 propiedades : tabla (array bidimensional de enteros), filas y cols 
			//implementa los siguientes metodos
			//1 constructor de la matriz (int filas, int cols)
			//comprobará que el numero de casillas de la matriz ocrrepondiente será un numero par y mayor que 0, si no es asi creará una matriz con el mismo numero de filas que de columnas (con cualquier numero mayor que 0 segun tu criterios)
			//Llamar al metodo rellenarMatriz()
			//void rellenarMatriz()
			//debe distribuir de forma aleatrotia en la matriz solo numeros solo numeros comprendios entre (1 y(filas*cols)/2)
			//int getvalor (int fila, int columna)
			// devolvera el valor numerico de la fila UnaFila con los de la Otra fila
			//int suma Max()
			//void intercambia  intercambia valores de Unafila con OtraFila
			//Anula el metodo tostring 
			}

}
