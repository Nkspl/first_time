
package Models;

/**
 *
 * @author nikens.pierrelouis
 */
public class Camara {
    
  // declaracion de variable
    private int id_camara;
    private String modelo;
    private String Obturador;
    private String marca;
    private String pixel;
    private String iso;
    private float precio;
    public String getmodelo;
    
    //constructores //  construye e instancia una clase ese en particular es sin parametro
    public Camara ()
    {id_camara = 1;
    modelo = "CANON T6 I";
    Obturador= "1/8";
    marca = "CANON";
    pixel= "300 MEGA PIXEL";
    iso= "1600";
    precio = 700000f;
     }
    
 // constructores // ese en particular es con parametros
    public Camara(int id_camara, String modelo, String Obturador, String marca, String pixel, String iso, float precio)
    {
       this.id_camara = id_camara;     
         this.modelo = modelo;
          this.Obturador=Obturador;
           this.marca =marca;   
            this.pixel= pixel; 
             this.iso = iso; 
              this.precio = precio; 
    }
    
    
    // Metodos accesador
    
    // para solicitar el id
    public int getid_camara()
    {
    return id_camara;
    }
    // para conseguir el modelo
    public String getmodelo()
    {
    return modelo;
    }
    
    
    public String getObturador()
    {
    return Obturador;
    }
    
    public String getmarca()
    {
    return marca;
    }
    
    public String getpixel ()
    {
    return pixel;
    }
     public String getiso ()
    {
    return iso;
    }
     public float getprecio()
    {
    return precio;
    }
     
     
     //Metodo mutador
    
     public void setid_camara (int id_camara)
     {this.id_camara = id_camara;
     }
     
     public void setmodelo (String modelo)
     {this.modelo = modelo;
     }
     
      public void setObturador (String Obturador)
     {this.Obturador = Obturador;
     }
     
     public void setmarca (String marca)
     {this.marca = marca;}
   
     public void setpixel (String pixel)
     {this.pixel = pixel;}
     
     public void setiso (String iso)
     {this.iso = iso;}
     
     public void setprecio (float precio)
     {this.precio = precio;}
     
     
     
     //sistema de impresion
    
    public void imprimirCamara()
    {
      System.out.println("El id de la camara es: " + getid_camara());  
      System.out.println("El modelo de la camara es: " + getmodelo());
      System.out.println("La velocidad de obturacion es de: " + getObturador());
      System.out.println("La marca es: " + getmarca());
      System.out.println("la cantidad de pixel es de: " + getpixel());
      System.out.println("El rango de iso de la camara es de: " + getiso());
      System.out.println("El precio de la camara es: " + getprecio()+ " Pesos");
     
}

}