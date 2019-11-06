import java.util.Scanner;

public class ejex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        Long num=sc.nextLong();
        String contiene="";
        String nocontiene="";
        String numOriginal= String.valueOf(num) ;

        for (int i=0;i<=9;i++){
            if(numOriginal.contains(String.valueOf(i))){
                contiene +=i+" ";


            }else {
                nocontiene+=i+" ";
            }
        }
        System.out.println("Digitos que se encuentran "+contiene);
        System.out.println("Digitos que no están "+nocontiene);

    }
    }


