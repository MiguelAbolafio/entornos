
public class mistring {
	public static String alReves(String cadena) {
		String nuevaCadena="";
		for(int  i = cadena.length()-1; i >-1 ; i--) {
			nuevaCadena+=cadena.charAt(i);
		}
		return nuevaCadena;
		
}
}

