/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomercializadora;

/**
 *
 * @author PC-Admin
 */
public class ProyectoComercializadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros li = new Libros(1,1.2, 0.04,"Cien años de Soledad","Gabriel García Marquéz","1970","sol",12545);
        li.Calcular(1.2, 0.04);
        li.Mostrar();
        
        Cd c = new Cd(2,2.5,0.09,"Wight","Hand Houses Likes","2014");
        c.Calcular(2.5, 0.09);
        c.Mostrar();
    }
    
}
