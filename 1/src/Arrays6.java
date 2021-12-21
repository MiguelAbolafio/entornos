
public class Arrays6 {
	public static long Factorial(int num) {
		long f=1;
		for (int i = 1; i <=num; i++) {
			f=f*i;
		}
		return f;
	}
	public static void mostrarArray(long[] miArray) {
		for (int i =0; i <miArray.length; i++) {
			System.out.println("el factorial de "+(i+1)+" es "+miArray[i]);
		}
	}
	public static void main(String[] args) {
		long [] misFact=new long[20];
		for (int i = 0; i <misFact.length; i++) {
			misFact[i]=Factorial(i+1);
		}
		mostrarArray(misFact);
	}
}
