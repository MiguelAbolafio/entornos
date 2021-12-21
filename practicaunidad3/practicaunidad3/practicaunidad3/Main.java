
package practicaunidad3;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase main para testear los métodos de la clase CCuenta
 * @author Miguel
 * @version v1.0
 * @since 03/12/2021
 */

public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * Método main hacer pruebas con los métodos de la clase CCuenta 
	 * @param args Es la cadena de argumentos de la clase main
	 */

	public static void main(String[] args) {
		MiInterfaz cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CuentaCorriente("Juan López", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("¿Cuánto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuátno desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción errónea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("¿Cuátno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecución");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
		/**
		 * El siguiente Método lnaza los mensajes necesarios según el resultado que de la operación deseada, 
		 * precisamente lanza los mensajes de errorer al usuario para su visualización
		 * @param cuenta1 Cuenta en la que se realiza la operación
		 * @param cantidad Cantidad que se utiliza en la operación
		 * @param opcion Opción en la que se da el resultado de la operación
		 */
	}


	public static void operativa_cuenta(MiInterfaz cuenta1, float cantidad, int opcion) {
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
		visualizarDatosCuenta(cuenta1, "buenos dias");
		

	}


	private static void visualizarDatosCuenta(MiInterfaz cuenta1, String string) {
		System.out.println("Datos clientes");
		 System.out.println(cuenta1.toString());
	}
	
}
