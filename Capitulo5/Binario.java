import java.util.Scanner;

    public class Binario{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo:");

        int tam = sc.nextInt();

        int[] arreglo = new int[tam];

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingresa un numero para la pisicion " + i + " del arreglo: ");
            arreglo [i] = sc.nextInt();
        }

        System.out.println(" CONTENIDO DEL ARREGLO: ");
        for (int y = 0; y < arreglo.length; y++){
            System.out.println("arreglo["+y+"] = " + arreglo [y]);
        }
        
        int num_buscado = 8;//numero en la posicion a buscar
        int inferior = 0;
        int centro;
        int superior = tam - 1;

        while(inferior <= superior){
            centro = (superior + inferior)/2;
            
            if(arreglo[centro] == num_buscado){
                System.out.println("El numero buscado esta en la posicion " + centro);
                break;
                
            }else if(num_buscado < arreglo[centro]){
                superior = centro - 1;
            }else{
                inferior = centro + 1;
            }
        }
    }
}
