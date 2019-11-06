import java.util.Scanner;

public class ejexa1 {
    public static void main(String[] args) {
        int tamaño;
        int altura;
        int ancho;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero mayor o igual que 5 e impar");
        tamaño=sc.nextInt();
        if(tamaño<5 && tamaño%2==0){
            System.out.println("la altura tiene que ser mayor o igual que 5");
        }else{
            for( ancho=1; ancho<=tamaño; ancho++){
                for( altura=1; altura<=tamaño; altura++){
                    if(ancho==1 || ancho==tamaño || altura==1 || altura==tamaño||ancho==(tamaño/2)+1){
                        System.out.print("M");
                    }
                    else{
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }
    }
}



