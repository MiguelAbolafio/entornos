package ejercicio4;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=(int)(Math.random()*100);
		int y=(int)(Math.random()*100);
		
		System.out.println(x+" "+y);
		
		boolean sw=(x<y);
		if (sw) {
			System.out.println("x es mayor que y");
		} 
		
		else { System.out.println("x es menor o igual que y");
		}
		
		
	}

}
