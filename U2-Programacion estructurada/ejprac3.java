import java.util.Scanner;

public class ejprac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para sacar su binario");
        numero=sc.nextInt();
        String binario="";
        if(numero>0){
            while(numero>0){
                if(numero%2==0){
                    binario=0+binario;
                }else{
                    binario=1+binario;
                }
                numero=(int) numero/2;
            }
        }else if(numero==0){
            binario="0";
        }else{
            binario="no se pudo imprimir";
        }
        System.out.println("el numero se ha convertido en binario es "+binario);
        }
    }