import java.util.Scanner;

public class ejer4 {
    public static int conviertearrayEnString(int[] a) {
        String cad="";
        for (int i = 0; i <a.length; i++) {
            cad=cad+a[i];

        }
        int b=Integer.parseInt( cad);
        return b;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int nume=sc.nextInt();
    int v[]=new int[nume];
        for (int i = 0; i <v.length; i++) {
            System.out.println("Introduce el valor de la posicion del array"+i);
            v[i]=sc.nextInt();

        }
        System.out.println(conviertearrayEnString(v));

    }
}
