
package Models;

/**
 *
 * @author nikens.pierrelouis
 */
public class vendedor {
    
      // declaracion de variable
    private int id_vendedor;
    private String nombre;
    private String apellido;
    private String rut;
    private int telefono;
    private String direccion;
   
    //constructores //  construye e instancia una clase ese en particular es sin parametro
    public vendedor()
    {id_vendedor = 1;
    nombre = "Cesar";
    apellido= "Acuña";
    rut = "14471957-8";
    telefono= 94060405;
    direccion= "Del sembrado #700";
     }
    
    
     // constructores // ese en particular es con parametros
    public vendedor(int id_vendedor, String nombre, String apellido, String rut, int telefono, String direccion)
    {
       this.id_vendedor = id_vendedor;     
         this.nombre = nombre;
          this.apellido = apellido;
           this.rut = rut;   
             this.telefono = telefono; 
              this.direccion = direccion;  
    }
    
    
        // Metodos accesador
    
    // para solicitar el id
    public int getid_vendedor()
    {
    return id_vendedor;
    }
    // para conseguir el nombre
    public String getnombre()
    {
    return nombre;
    }
     // para conseguir el apellido
    public String getapellido()
    {
    return apellido;
    }
     // para conseguir el rut
    public String getrut()
    {
    return rut;
    }
     // para conseguir el telefono
    public int gettelefono()
    {
    return telefono;
    }
     // para conseguir la direccion
     public String getdireccion ()
    {
    return direccion;
    }
    
    
    //Metodo mutador
    
     public void setid_vendedor (int id_vendedor)
     {this.id_vendedor = id_vendedor;
     }
     
     public void setnombre (String nombre)
     {this.nombre = nombre;
     }
     
      public void setapellidor (String apellido)
     {this.apellido = apellido;
     }
     
     public void setrut (String rut)
     {this.rut = rut;}
   
     public void settelefono (int telefono)
     {this.telefono = telefono;}
     
     public void setdireccion (String direccion)
     {this.direccion = direccion;}
    
    
    //sistema de impresion
    
    public void imprimirvendedor()
    {
      System.out.println("El id del vendedor es: " + getid_vendedor());  
      System.out.println("El nombre del vendedor es: " + getnombre());
      System.out.println("El apellido del vendedor es: " + getapellido());
      System.out.println("el rut del vendedor es: " + getrut());
      System.out.println("el numero de telefono del vendedor es: " + gettelefono());
      System.out.println("la direccion del vendedor es: " + getdireccion());     
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
