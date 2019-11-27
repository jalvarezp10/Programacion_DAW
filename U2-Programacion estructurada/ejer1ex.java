import java.util.Arrays;
import java.util.Scanner;

public class ejer1ex {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de filas");
        int x =sc.nextInt() ;
        System.out.println("Introduzca el numero de columnas");

        int y=sc.nextInt();

        int [][] matriz=new int[x][y];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz.length ; j++) {
                System.out.println(Arrays.toString(matriz));

            }

        }



    }
}
