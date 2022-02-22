package practicaunidad3;
/**
 * Clase CCuenta con sus métodos
 * @author Miguel
 * @version v1.0
 * @since 03/12/2021 
 */
public class CCuenta {

	/**
	 * Aquí tenemos la Declaración de variables y creará una cuenta creada con el método cuenta
	 */
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * el siguiente Método hace pública la clase CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * Método para crear una cuenta, en la que encontramos los siguientes atributos: nombre del propietario, número de cuenta, saldo y el interés de la cuenta.
	 * @param nom Nombre del propietario de la cuenta
	 * @param cue Número de la cuenta
	 * @param sal Saldo que hay en la cuenta
	 * @param tipo Tipo de interés que se asocia a la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	/**
	 * Método que cambiará el nombre del propietariol en la cuenta
	 * @param nom Nuevo nombre que se asignará a la cuenta
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Método que pregunta por el nombre del propietario de la cuenta
	 * @return Devuelve el nombre de la cuenta
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * Método que pregunta por el saldo de la cuenta
	 * @return Devuelve el saldo que hay en la misma
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * el siguiente Método no pregunta
	 * La cantidad de dinero que deseamos ingresar y lo añade a la cuenta. 
	 * Y no nos permite introducir una cantidad negativa ya que esto no se podría
	 * @param cantidad Es la antidad de dinero deseada a ingresar
	 * @throws Exception Evita el error de ingresar una cantidad negativa de dinero
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * El siguiente Método que nos pregunta
	 * La cantidad de dinero que se desea retirar y lo resta de la cuenta. 
	 * Y vuelva a evitr introducir una cantidad negativa
	 * @param cantidad es La cantidad de dinero a retirar
	 * @throws Exception Evita que retiremos una cantidad negativa de dinero
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * El siguiente Método pregunta por el número de cuenta
	 * @return Devuelve el número de cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	/**
	 * Els siguiente Método establece un número de cuenta
	 * @param cuenta Nº de cuenta que se desea establecer
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * El siguiente Método establece el saldo de cuenta
	 * @param saldo Saldo que se quiere establecer en la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * El siguiente Método pregunta el tipo de interés de la cuenta
	 * @return Devuelve el tipo de interés de la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * El siguiente Método estalece el tipo de interés de la cuenta
	 * @param tipoInterés Tipo de interés que se quiere establecer en la cuenta
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
