import java.util.Scanner;

public class ejprac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota de los examenes");
        int nota1=sc.nextInt();
        int nota2=sc.nextInt();
        int media=(nota1+nota2)/2;
        if (media>=9) {
            System.out.println("enhorabuena tienes un sobresaliente");
        }
        else if (media<9 && media>=7) {
            System.out.println("enhorabuena tienes un notable");
        }
        else if (media<7 && media>=6) {
            System.out.println("enhorabuena tienes un bien");
        }
        else if(media<6 && media>=5) {
            System.out.println("enhorabuena tienes un suficiente");
        }
        else if(media<5){
            System.out.println("suspenso, introduzca nota de recuperacion");
            int recuperacion =sc.nextInt();

            if (recuperacion<5){
                System.out.println(" no apto");
            }
            else if (recuperacion>5){
                System.out.println("apto");
            }




        }
    }
}
