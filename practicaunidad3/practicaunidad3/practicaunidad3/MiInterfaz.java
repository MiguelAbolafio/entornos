package practicaunidad3;

public interface MiInterfaz {

	/**
	 * Método que cambiará el nombre del propietariol en la cuenta
	 * @param nom Nuevo nombre que se asignará a la cuenta
	 */
	void asignarNombre(String nom);

	/**
	 * Método que pregunta por el nombre del propietario de la cuenta
	 * @return Devuelve el nombre de la cuenta
	 */
	String getNombre();

	/**
	 * Método que pregunta por el saldo de la cuenta
	 * @return Devuelve el saldo que hay en la misma
	 */
	double getSaldo();

	/**
	 * el siguiente Método no pregunta
	 * La cantidad de dinero que deseamos ingresar y lo añade a la cuenta. 
	 * Y no nos permite introducir una cantidad negativa ya que esto no se podría
	 * @param cantidad Es la antidad de dinero deseada a ingresar
	 * @throws Exception Evita el error de ingresar una cantidad negativa de dinero
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * El siguiente Método que nos pregunta
	 * La cantidad de dinero que se desea retirar y lo resta de la cuenta. 
	 * Y vuelva a evitr introducir una cantidad negativa
	 * @param cantidad es La cantidad de dinero a retirar
	 * @throws Exception Evita que retiremos una cantidad negativa de dinero
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * El siguiente Método pregunta por el número de cuenta
	 * @return Devuelve el número de cuenta
	 */
	String getCuenta();

	/**
	 * Els siguiente Método establece un número de cuenta
	 * @param cuenta Nº de cuenta que se desea establecer
	 */
	void setCuenta(String cuenta);

	/**
	 * El siguiente Método establece el saldo de cuenta
	 * @param saldo Saldo que se quiere establecer en la cuenta
	 */
	void setSaldo(double saldo);

	/**
	 * El siguiente Método pregunta el tipo de interés de la cuenta
	 * @return Devuelve el tipo de interés de la cuenta
	 */
	double getTipoInteres();

	/**
	 * El siguiente Método estalece el tipo de interés de la cuenta
	 * @param tipoInterés Tipo de interés que se quiere establecer en la cuenta
	 */
	void setTipoInteres(double tipoInterés);

	void setNombre(String nombre);

}