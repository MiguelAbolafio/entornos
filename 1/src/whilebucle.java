import java.util.Scanner;
public class whilebucle {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num, contador=0, suma=0;
			while (suma<100) {
				System.out.println("introduce numero");
				num=sc.nextInt();
				contador++;
				suma+=num;
				System.out.println(num);
			}

	}

}
