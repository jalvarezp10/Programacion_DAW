import java.util.Scanner;

public class ejer5 {
    public static int aleatorioDeArray(int[] a) {
        return a[(int) (Math.random()*a.length)];


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int n=sc.nextInt();
        int v[]= new int[n];
        for (int i = 0; i <v.length ; i++) {
            System.out.println("Introduce un numero");
            v[i]=sc.nextInt();

        }
        System.out.println(aleatorioDeArray(v));
    }
}
