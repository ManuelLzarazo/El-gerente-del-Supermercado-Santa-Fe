
package gerente.de.supermercado;


import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class GerenteDeSupermercado {

  
    
    public static void main(String[] args) {
        double cedula;
        double salario;
        String nombre, departamento, posicion;
        
              
        
        JOptionPane.showMessageDialog(null, "Bievenido al Supermercado SantaFe");
        
     
                
        cedula = Double.parseDouble(JOptionPane.showInputDialog("Diguite la cédula del Nuevo empleado:"));
        
        nombre=JOptionPane.showInputDialog("Nombre del Nuevo Empleado:");
        
        departamento=JOptionPane.showInputDialog("Departamento del Nuevo empleado:");
        
        posicion=JOptionPane.showInputDialog("Posición del Nuevo Empleado:");
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario del Nuevo Empleado:"));
        
              
        JOptionPane.showMessageDialog(null,"Cédula del  Empleado:"+cedula);
        
        JOptionPane.showMessageDialog(null,"Nombre del  Empleado:"+nombre);
        
        JOptionPane.showMessageDialog(null,"Departamento del  Empleado:"+departamento);
        
        JOptionPane.showMessageDialog(null,"Posicion del  Empleado:"+posicion);
                              
        JOptionPane.showMessageDialog(null,"Salario del  Empleado:" +salario);
                          
        Empleado Empleado1 = new Empleado  (789456," Pepito Perez", "Administrativo","Gerente",5000000);
        Empleado Empleado2 = new Empleado (456123," Gloria Ortiz", "Administrativo", "Secrertaria",1000000);
        Empleado Empleado3 = new Empleado (357951, "Arturo Diaz", "Administrativo", "Supernumerario",1000000);
        Empleado Empleado4 = new Empleado (123456, "Juan Melas", "Operativo"," Acomodador",1200000);
        Empleado Empleado5 = new Empleado (159753, "Maria Cruz", "Operativo", "Cajera",1400000);
        Empleado Empleado6 = new Empleado (951753, "Miguel Alvarez","Operativo", "Mensajero",900000);
        Empleado Empleado7 = new Empleado (357159, "Omar Velez", "Seguridad", "Supervisor",1800000);
        Empleado Empleado8 = new Empleado (951357, "Jorge Lozano", "Seguridad", "VigilanteA",1300000);
        Empleado Empleado9 = new Empleado (357753, "Ruben Molano", "Seguridad", "VigilanteB",1300000);
        Empleado Empleado10 = new Empleado (951159, "Javier Villa", "Seguridad", "Turnador",800000);
        Empleado1.verDatos();
        Empleado2.verDatos();
        Empleado3.verDatos();
        Empleado4.verDatos();
        Empleado5.verDatos();
        Empleado6.verDatos();
        Empleado7.verDatos();
        Empleado8.verDatos();
        Empleado9.verDatos();
        Empleado10.verDatos();
       
        ArrayList<Empleado> listaEmpleado= new ArrayList<>();
        
       listaEmpleado.add(new Empleado(000000," nombre", "departamento","posicion",0000000));
       listaEmpleado.add(new Empleado(789456," Pepito Perez", "Administrativo","Gerente",5000000));
       listaEmpleado.add(new Empleado(456123," Gloria Ortiz", "Administrativo", "Secrertaria",1000000));
       listaEmpleado.add(new Empleado(357951, "Arturo Diaz", "Administrativo", "Supernumerario",1000000));
       listaEmpleado.add(new Empleado(123456, "Juan Melas", "Operativo"," Acomodador",1200000));
       listaEmpleado.add(new Empleado(159753, "Maria Cruz", "Operativo", "Cajera",1400000));
       listaEmpleado.add(new Empleado(951753, "Miguel Alvarez","Operativo", "Mensajero",900000));
       listaEmpleado.add(new Empleado(357159, "Omar Velez", "Seguridad", "Supervisor",1800000));
       listaEmpleado.add(new Empleado(951357, "Jorge Lozano", "Seguridad", "VigilanteA",1300000));
       listaEmpleado.add(new Empleado(357753, "Ruben Molano", "Seguridad", "VigilanteB",1300000));
       listaEmpleado.add(new Empleado(951159, "Javier Villa", "Seguridad", "Turnador",800000));
       
       //El metodo set nos permite agregar un elemento en el lugar que queremos pero sustituye el elemento si ya existe otro
       listaEmpleado.set(1, new Empleado(789456,"Pepito Perez","Administrativo","Gerente",5000000));
       //Esto lo ponemos cuando ya se esta seguro que no se anadiran mas elementos para que el recolector de basura libere memoria, pero no impide anadir mas elementos
       listaEmpleado.trimToSize();
       //el metodo size nos permite conocer el tamano actual de la lista
       JOptionPane.showMessageDialog(null,listaEmpleado.size());
       //este metodo nos devuelve un elemento en un lugar en especifico
       

       for(int i=0; i<listaEmpleado.size(); i++){
            Empleado e=listaEmpleado.get(i);
                   }
       Empleado arrayEmpleado[]=new Empleado[listaEmpleado.size()];
       listaEmpleado.toArray(arrayEmpleado);
        for (Empleado arrayEmpleado1 : arrayEmpleado) {
            
            double Nuevacedula = Double.parseDouble(JOptionPane.showInputDialog("Digite la cedula del empleado que desea consultar:"));
class Empleado{

            private final double cedula;
            private final String departamento;
            private final String posicion;
            private final String nombre;
            private final double salario;
    public Empleado(double cedula, String nombre, String departamento, String posicion, double salario){
        this.cedula =cedula;
        this.nombre=nombre;
        this.departamento=departamento;
        this.posicion=posicion;
        this.salario=salario;

  }
    public String dameDatos(){
        return + cedula + " nombre " + " departamento "+ "posicion"+ salario;  
    }
}
        }
    }
}

        
    
    

    
    





        
        
  





       


     
    


   