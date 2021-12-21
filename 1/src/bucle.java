
public class bucle {

	public static void main(String[] args) {
			int n1=-(int) (Math.random()*100);
			int menor=n1;
			System.out.println(n1);
			for(int i=0; i<9 ; i++) {
				int num=-(int) (Math.random()*100);
				System.out.println(num);
				if(num<menor) {
					menor=num;			
				}
			} 
			System.out.println("El numero menor es "+menor);
		}	
	}
