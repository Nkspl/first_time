
package com.mycompany.foto_app;

import Gui.Home_form;
import Models.Camara;
import Models.Cliente;





public class Foto_app {

    public static void main(String[] args) {

        
        System.out.println("Datos de la camara");
        
        Camara cam = new Camara (1,"Cannon T6i"," 1 hasta 1/125 segundos", "Cannon", "300 MEGA PIXEL", "100 hasta 1600 ISO",700000);
        cam.imprimirCamara();
        
        
        System.out.println("..............");
        System.out.println("Datos del cliente");
        
        
        Cliente cli = new Cliente (1,"Nickens", "Pierre Louis", "24471957-6", 94060500, "Ecuador #800");
        cli.imprimirCliente();
        
                
        Home_form h = new Home_form();
        h.setVisible(true);
        
        
    }
    
    
    
    
}
