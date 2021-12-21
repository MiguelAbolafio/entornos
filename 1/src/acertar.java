import java.util.Scanner;

public class acertar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador=10;
        int numUsuario;
        int numMaquina=(int)(Math.random()*100+1);
        do {
        System.out.println("Acierta un numero del 1 al 100");
        System.out.println("Tienes "+contador+" intentos");
        numUsuario=sc.nextInt();
        contador--;
            if(numMaquina==numUsuario) {
                System.out.println("has acertado el numero era "+numMaquina+" en el intento "+(10-contador));
            }else if(numMaquina>numUsuario) {
                System.out.println("Has fallado te has quedado por debajo ");
            }else {
                System.out.println("Te has pasado");
            }
        }while(numUsuario!=numMaquina && contador>0);
        if(numUsuario!=numMaquina && contador>0) {
            System.out.println("Te has quedado sin intentos prueba de nuevo");
        }
        System.out.println("Fin del programa");
        sc.close();

    }

}