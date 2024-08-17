
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
            System.out.println("5.funciones trigonometrics");
            System.out.println("6.raiz");
            System.out.println("7.potencia");
            System.out.println("8.salir");
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
                case 5 -> {
                    int opci=0;
                    double angulo;
                    do {
                     System.out.println("-----funciones trigonometricas----");
                     System.out.println("1.seno");
                     System.out.println("2.coseno");
                     System.out.println("3.tangente");
                     System.out.println("4.salir");
                     System.out.println("ingrese su opcion");
                     opci = scanner.nextInt();
                   
                     
                     switch(opci){
                         case 1->{
                             System.out.println("ingrese el numero :");
                             angulo = scanner.nextDouble();
                             System.out.println("el seno es: "+Math.sin(angulo));
                             break;
                         }
                          case 2->{
                             System.out.println("ingrese el numero :");
                             angulo = scanner.nextDouble();
                             System.out.println("el coseno es: "+ Math.cos(angulo));
                             break;
                          }
                          case 3->{
                             System.out.println("ingrese el numero :");
                             angulo = scanner.nextDouble();
                             System.out.println("el tangente es: " + Math.tan(angulo));
                             break;
                          }
                          case 4->{
                             System.out.println("salir");
                             break;
                          }
                        default -> 
                        System.out.println("Opcion invalida.");
                     }     
                   
                     }while(opci !=4);
             }        
                          
                case 6->{
                    System.out.println("Raiz");
                    System.out.println("ingrese el numero :");
                    double numero = scanner.nextDouble();
                    System.out.println("ingrese el indice de la raiz:");
                    double indice = scanner.nextDouble();
                    double raize = Math.pow(numero, 1/indice);
                    System.out.println("la raiz" + indice + "enesima de " + numero + "es: " + raize );
                }
                case 7 ->{
                    System.out.println("potencia");
                    System.out.println("ingrese la base :");
                    double base = scanner .nextDouble();
                    System.out.println("ingrese el exponente :");
                    int expo = scanner.nextInt();
                    double resul = Math.pow(base, expo);
                    System.out.println(base + "elevado a la" + expo + "es" + resul);
                }
                case 8 ->{
                    System.out.println("Saliendo del programa...");
                }
                 default -> 
                 System.out.println("Opcion invalida.");
            }
        }while (opc != 8);
       scanner.close();
     }
}
