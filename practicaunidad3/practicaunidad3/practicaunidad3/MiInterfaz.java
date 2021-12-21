package practicaunidad3;

public interface MiInterfaz {

	/**
	 * M�todo que cambiar� el nombre del propietariol en la cuenta
	 * @param nom Nuevo nombre que se asignar� a la cuenta
	 */
	void asignarNombre(String nom);

	/**
	 * M�todo que pregunta por el nombre del propietario de la cuenta
	 * @return Devuelve el nombre de la cuenta
	 */
	String getNombre();

	/**
	 * M�todo que pregunta por el saldo de la cuenta
	 * @return Devuelve el saldo que hay en la misma
	 */
	double getSaldo();

	/**
	 * el siguiente M�todo no pregunta
	 * La cantidad de dinero que deseamos ingresar y lo a�ade a la cuenta. 
	 * Y no nos permite introducir una cantidad negativa ya que esto no se podr�a
	 * @param cantidad Es la antidad de dinero deseada a ingresar
	 * @throws Exception Evita el error de ingresar una cantidad negativa de dinero
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * El siguiente M�todo que nos pregunta
	 * La cantidad de dinero que se desea retirar y lo resta de la cuenta. 
	 * Y vuelva a evitr introducir una cantidad negativa
	 * @param cantidad es La cantidad de dinero a retirar
	 * @throws Exception Evita que retiremos una cantidad negativa de dinero
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * El siguiente M�todo pregunta por el n�mero de cuenta
	 * @return Devuelve el n�mero de cuenta
	 */
	String getCuenta();

	/**
	 * Els siguiente M�todo establece un n�mero de cuenta
	 * @param cuenta N� de cuenta que se desea establecer
	 */
	void setCuenta(String cuenta);

	/**
	 * El siguiente M�todo establece el saldo de cuenta
	 * @param saldo Saldo que se quiere establecer en la cuenta
	 */
	void setSaldo(double saldo);

	/**
	 * El siguiente M�todo pregunta el tipo de inter�s de la cuenta
	 * @return Devuelve el tipo de inter�s de la cuenta
	 */
	double getTipoInteres();

	/**
	 * El siguiente M�todo estalece el tipo de inter�s de la cuenta
	 * @param tipoInter�s Tipo de inter�s que se quiere establecer en la cuenta
	 */
	void setTipoInteres(double tipoInter�s);

	void setNombre(String nombre);

}