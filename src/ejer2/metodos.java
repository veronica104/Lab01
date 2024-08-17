
package ejer2;

public class metodos {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean raiz;
    private boolean potencia;
    
    
   public metodos(){
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       seno=false;
       coseno=false;
       tangente=false;
       raiz=false;
       potencia=false;
       
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
   
   public void raiz(String numero){
   this.resultado=Double.parseDouble(cadena);
   raiz=true;
   this.cadena="";
   }
   
   public void seno(String numero){
   this.resultado=Double.parseDouble(cadena);
   seno=true;
   this.cadena="";
   }
     
   public void coseno(String numero){
   this.resultado=Double.parseDouble(cadena);
   coseno=true;
   this.cadena="";
   }
   
   public void tangente(String numero){
   this.resultado=Double.parseDouble(cadena);
   tangente=true;
   this.cadena="";
   }
   
    public void potencia(String numero){
   this.resultado=Double.parseDouble(cadena);
   potencia=true;
   this.cadena="";
   }

    
    //////////////////////////////////////////////////////////////////////////
    
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
        
        else if (raiz==true){
            resultado=Math.sqrt(Double.parseDouble(numero));
        }
        
        else if (seno==true){
            double seno=Math.toRadians(resultado);
            resultado=Math.sin(seno);
        }
        
        else if (coseno==true){
            double coseno=Math.toRadians(resultado);
            resultado=Math.cos(coseno);
        }
        
        else if (tangente==true){
            double tangente=Math.toRadians(resultado);
            resultado=Math.tan(tangente);
        }
        
        else if (potencia==true){
            resultado=Math.pow(resultado, Double.parseDouble(numero));
        }
        
        
        
        suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       seno=false;
       coseno=false;
       tangente=false;
       raiz=false;
       potencia=false;
       
       return resultado;
    }

    String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
