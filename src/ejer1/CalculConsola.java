
package ejer1;

import java.util.Scanner;

public class CalculConsola {
    @SuppressWarnings("empty-statement")
    public static void main (String args[]) {
        System.out.println("Calculadora consola");
        Scanner scanner= new Scanner (System.in);
        int opc=0;
        
        do{
            System.out.println("----menu----");
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("3.multiplicacion");
            System.out.println("4.division");
            System.out.println("5.salir");
            System.out.println("ingrese su opcion: ");
            opc = scanner.nextInt();
            
            switch(opc){
                case 1 -> {
                    System.out.println("suma");
                    System.out.println("ingrese el primer numero :");
                    int num1=scanner.nextInt();
                    System.out.println("ingrese el segundo  numero :");
                    int num2=scanner.nextInt();
                    int suma =num1+num2;
                    System.out.println("la suma es :"+suma);
                }
                case 2 -> {
                     System.out.println("resta");
                    System.out.println("ingrese el primer numero :");
                    int num1=scanner.nextInt();
                    System.out.println("ingrese el segundo  numero :");
                    int num2=scanner.nextInt();
                    int resta =num1-num2;
                    System.out.println("la resta es :"+resta);
                }
                case 3 -> {
                     System.out.println("multiplicacion");
                    System.out.println("ingrese el primer numero :");
                    int num1=scanner.nextInt();
                    System.out.println("ingrese el segundo  numero :");
                    int num2=scanner.nextInt();
                    int multi =num1*num2;
                    System.out.println("la multiplicacion es :"+multi);
                }
                case 4 -> {
                    System.out.println("division");
                    System.out.println("ingrese el primer numero :");
                    int num1=scanner.nextInt();
                    System.out.println("ingrese el segundo  numero :");
                    int num2=scanner.nextInt();
                    int divi =num1/num2;
                    System.out.println("la division es :"+divi);
                }
                case 5 ->{
                    System.out.println("Saliendo del programa...");
                }
                 default -> 
                 System.out.println("Opcion invalida.");
            }
        }while (opc != 5);
       scanner.close();
     }
}
    
