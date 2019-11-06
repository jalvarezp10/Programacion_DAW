import java.util.Scanner;

public class ejex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero mayor o igual que 2 digitos ");
        long n=sc.nextLong();
        System.out.println("Introduzca la posición que quieres partir el número");
        int x=sc.nextInt();
        long aux=n;
        int cont=0;
        while (aux!=0){
            aux=aux/10;

            cont++;
        }
        aux=n;
        if(x<1|| x>cont){
            System.out.println("no es posible con ese numero");
        }else if(x==cont){
            System.out.println(n);
        }else {
            for(int i=0;i<cont-x;i++){
                aux=aux/10;

            }
            System.out.println("Primera parte "+aux);
            for(int i=0;i<cont-x;i++){
                aux=aux*10;
            }
        }
        System.out.println("Segunda "+(n-aux));
    }
}
