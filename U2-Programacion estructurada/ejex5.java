import java.util.Scanner;

public class ejex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una cadena para sacar vocales ");
        System.out.print("Cad: ");
        String Cadena = sc.nextLine();
        String vocap="";
        String vocnap="";
        int cont=0;

        for(int i=0; i<Cadena.length(); i++)
        {
            if(Cadena.charAt(i) == 'a' || Cadena.charAt(i) == 'e' || Cadena.charAt(i) == 'i' || Cadena.charAt(i) == 'o' || Cadena.charAt(i) == 'u'){
                vocap=vocap+Cadena.charAt(i);
                cont++;
            }   else{
                vocnap=vocnap+Cadena.charAt(i);
            }
        }System.out.println("Numero de vocales en la cadena : "+cont );




    }
}
