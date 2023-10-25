/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author nikens.pierrelouis
 */
public class Modelo {
    
     // declaracion de variable
    private int id_modelo;
    private String nombre;
    private String apellido;
    private String rut;
    private int telefono;
    private String direccion;
   
    //constructores //  construye e instancia una clase ese en particular es sin parametro
    public Modelo()
    {id_modelo = 1;
    nombre = "Kim";
    apellido= "Kardashin";
    rut = "24471957-6";
    telefono= 94060500;
    direccion= "ecuador #800";
     }
    
    
     // constructores // ese en particular es con parametros
    public Modelo(int id_modelo, String nombre, String apellido, String rut, int telefono, String direccion)
    {
       this.id_modelo = id_modelo;     
         this.nombre = nombre;
          this.apellido = apellido;
           this.rut = rut;   
             this.telefono = telefono; 
              this.direccion = direccion;  
    }
    
    
        // Metodos accesador
    
    // para solicitar el id
    public int getid_modelo()
    {
    return id_modelo;
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
    
     public void setid_modelo (int id_cliente)
     {this.id_modelo = id_cliente;
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
    
    public void imprimirCliente()
    {
      System.out.println("El id del cliente es: " + getid_modelo());  
      System.out.println("El nombre del cliente es: " + getnombre());
      System.out.println("El apellido del cliente es: " + getapellido());
      System.out.println("el rut del cliente es: " + getrut());
      System.out.println("el numero de telefono del cliente es: " + gettelefono());
      System.out.println("la direccion del cliente es: " + getdireccion());     
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
