package practicaunidad3;

/**
 * Clase CCuenta con sus m�todos
 * @author Miguel
 * @version v1.0
 * @since 03/12/2021 
 */
public class CuentaCorriente implements MiInterfaz {

	private static final int Zero = 0;
	/**
	 * Aqu� tenemos la Declaraci�n de variables y crear� una cuenta creada con el m�todo cuenta
	 */
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * el siguiente M�todo hace p�blica la clase CCuenta
	 */
	public CuentaCorriente() {
	}

	/**
	 * M�todo para crear una cuenta, en la que encontramos los siguientes atributos: nombre del propietario, n�mero de cuenta, saldo y el inter�s de la cuenta.
	 * @param nom Nombre del propietario de la cuenta
	 * @param cue N�mero de la cuenta
	 * @param sal Saldo que hay en la cuenta
	 * @param tipo Tipo de inter�s que se asocia a la cuenta
	 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	/**
	 * M�todo que cambiar� el nombre del propietariol en la cuenta
	 * @param nom Nuevo nombre que se asignar� a la cuenta
	 */
	@Override
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * M�todo que pregunta por el nombre del propietario de la cuenta
	 * @return Devuelve el nombre de la cuenta
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que pregunta por el saldo de la cuenta
	 * @return Devuelve el saldo que hay en la misma
	 */
	@Override
	public double getSaldo() {
		return saldo;
	}

	/**
	 * el siguiente M�todo no pregunta
	 * La cantidad de dinero que deseamos ingresar y lo a�ade a la cuenta. 
	 * Y no nos permite introducir una cantidad negativa ya que esto no se podr�a
	 * @param cantidad Es la antidad de dinero deseada a ingresar
	 * @throws Exception Evita el error de ingresar una cantidad negativa de dinero
	 */
	@Override
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * El siguiente M�todo que nos pregunta
	 * La cantidad de dinero que se desea retirar y lo resta de la cuenta. 
	 * Y vuelva a evitr introducir una cantidad negativa
	 * @param cantidad es La cantidad de dinero a retirar
	 * @throws Exception Evita que retiremos una cantidad negativa de dinero
	 */
	@Override
	public void retirar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * El siguiente M�todo pregunta por el n�mero de cuenta
	 * @return Devuelve el n�mero de cuenta
	 */
	@Override
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Els siguiente M�todo establece un n�mero de cuenta
	 * @param cuenta N� de cuenta que se desea establecer
	 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * El siguiente M�todo establece el saldo de cuenta
	 * @param saldo Saldo que se quiere establecer en la cuenta
	 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * El siguiente M�todo pregunta el tipo de inter�s de la cuenta
	 * @return Devuelve el tipo de inter�s de la cuenta
	 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * El siguiente M�todo estalece el tipo de inter�s de la cuenta
	 * @param tipoInter�s Tipo de inter�s que se quiere establecer en la cuenta
	 */
	@Override
	public void setTipoInteres(double tipoInter�s) {
		this.tipoInteres = tipoInter�s;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
