package practicaunidad3;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase main para testear los m�todos de la clase CCuenta
 * @author Miguel
 * @version v1.0
 * @since 03/12/2021
 */

public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * M�todo main hacer pruebas con los m�todos de la clase CCuenta 
	 * @param args Es la cadena de argumentos de la clase main
	 */

	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CCuenta("Juan L�pez", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MEN� DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("�Cu�nto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("�Cu�tno desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecuci�n");
				} else {
					System.err.println("Opci�n err�nea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("�Cu�nto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("�Cu�tno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecuci�n");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);
		/**
		 * El siguiente M�todo lnaza los mensajes necesarios seg�n el resultado que de la operaci�n deseada, 
		 * precisamente lanza los mensajes de errorer al usuario para su visualizaci�n
		 * @param cuenta1 Cuenta en la que se realiza la operaci�n
		 * @param cantidad Cantidad que se utiliza en la operaci�n
		 * @param opcion Opci�n en la que se da el resultado de la operaci�n
		 */
	}

	public static void operativa_cuenta(CCuenta cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
	}
}