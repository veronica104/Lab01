
package ejer2;


public class metodos {
   
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    
    public metodos(){
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
    }
       
     public String concatenamiento(String numero){
       this.cadena=this.cadena+numero;
       return this.cadena;
   }
   
   public void suma(String numero){
   this.resultado=Double.parseDouble(cadena);
   suma=true;
   this.cadena="";
   }
   
   public void resta(String numero){
   this.resultado=Double.parseDouble(cadena);
   resta=true;
   this.cadena="";
   }
   
   public void multiplicacion(String numero){
   this.resultado=Double.parseDouble(cadena);
   multiplicacion=true;
   this.cadena="";
   }
   
   public void division(String numero){
   this.resultado=Double.parseDouble(cadena);
   division=true;
   this.cadena="";
   }
   
  ///////////////////////////////////////////////////////////////////////
   
   public double resultado(String numero){
        
        if (suma==true){
            resultado=resultado+Double.parseDouble(numero);
        }
        
        else if (resta==true){
            resultado=resultado-Double.parseDouble(numero);
        }
        
        else if (multiplicacion==true){
            resultado=resultado*Double.parseDouble(numero);
        }
        
        else if (division==true){
            resultado=resultado/Double.parseDouble(numero);
        }
    
       
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       
       return resultado;
   }
}
