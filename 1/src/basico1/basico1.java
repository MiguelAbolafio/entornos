package basico1;

public class basico1 {

	public static void main(String[] args) {
		int contador=0;
		
		for(int i=1; i<100; i++) {
			contador++;
			if(contador==20 || contador==40 || contador==60 || contador==80){
			System.out.println();
			}else {
				System.out.print("*");
			}
		}
	}

}
