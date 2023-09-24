
package tablass;

import java.util.ArrayList;


class Principal {

      static ArrayList<Persona> personas;
    
    
    public static void main(String[] args) {
        
        personas=new ArrayList<>(); //definir Lista 
        Ingreso_personas ventana= new Ingreso_personas();
        ventana.setVisible(true);
    }
    
}
