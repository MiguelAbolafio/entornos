import java.util.Scanner;
public class rango2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de preguntas que se realizaron");
		int preguntas = sc.nextInt();
		System.out.println("Introduce la cantidad de aciertos que hubo");
		int aciertos = sc.nextInt();
		
		if(aciertos>preguntas || aciertos<0 || preguntas<1) {
			System.out.println("Datos incorrectos");
		}else { 
			double porcentaje=(aciertos*100.0/preguntas);
			if(porcentaje<50) {
				System.out.println("Descartado");
			}else if(porcentaje<75){
				System.out.println("Nivel regular");
			}else if(porcentaje<90) {
				System.out.println("Nivel medio");
			}else if(porcentaje>=90){
				System.out.println("Nivel maximo");
			}
		}
		
		
		
				sc.close();
	}

}
