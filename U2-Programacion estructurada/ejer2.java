import javax.swing.*;
import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        int v[][]=new int[4][5];
        int sumaFilas = 0;
        int sumaColum=0;
        int sumatotal=0;
        Scanner sc=new Scanner(System.in);


        // Llenar Vector
        for(int i = 0; i < v.length; i++){
            for (int j = 0; j <v.length; j++) {

            }
            sumaFilas +=v[i][0];
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            sumaFilas=sc.nextInt();
        }
        for(int i = 0; i < v.length; i++){
            for (int j = 0; j <v.length; j++) {

            }
            sumaFilas +=v[i][1];
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            sumaFilas = sc.nextInt();
        }
        for(int i = 0; i < v.length; i++){
            for (int j = 0; j <v.length ; j++) {

            }
            sumaFilas +=v[i][2];
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            sumaFilas = sc.nextInt();
        }
        for(int i = 0; i < v.length; i++){
            for (int j = 0; j <v.length; j++) {

            }
            sumaFilas +=v[i][3];
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            sumaFilas = sc.nextInt();
        }
        for(int i = 0; i < v.length; i++){
            for (int j = 0; j <v.length ; j++) {


            }

            System.out.print("Ingrese el número en la posición " + (i) + " :");
            sumaFilas = sc.nextInt();
        }
        for (int i = 0; i < v.length; i++) {
                    for (int j = 0; j < v[i].length; j++) {
                         System.out.print(v[i][j]+"\t");
                       }
                    System.out.println("");
                 }

        // Calcular Suma elementos vector
        for(int j = 0; j < v.length; j++){
            sumaColum = v[0][j];}

        // Calcular Media
        sumatotal= sumaColum+sumaFilas / 2;
        System.out.println();



    }
}

