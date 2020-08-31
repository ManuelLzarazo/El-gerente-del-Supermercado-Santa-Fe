
package gerente.de.supermercado;

import javax.swing.JOptionPane;


public class Empleado {

    static void trimToSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Atributos
    public double cedula;
    public String nombre;
    public String departamento;
    public String posicion;
    public double salario;
    
    //Constructores
    public Empleado(){
        this.cedula = 0;
        this.nombre = "NombreDelEmpleado";
        this.departamento = "DepartamentoDelEmpleado";
        this.posicion = "PosicionDelEmpleado";
        this.salario = 0;
           
    }

    
    public Empleado (double cedula, String NombreDelEmpleado, String DepartamentoDelEmpleado,  String PosicionDelEmpleado, double salario){
     this.cedula = cedula;
     this.nombre = NombreDelEmpleado;
     this.departamento =DepartamentoDelEmpleado;
     this.posicion = PosicionDelEmpleado;
     this.salario =salario;
     
}

    Empleado(String cedula_nombre_departamento_posicion_salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Empleado(double cedula, String _nombre_departamento_posicion, double salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    //Métodos
    //Accesadores (get)
    public double getcedula(){
        return this.cedula;
    }
    public String getnombre(){
        return this.nombre;
        
    }
    public String getdepartamento(){
        return this.departamento;
        
    }
    public String getposicion(){
        return this.posicion;
    }
    public double getsalario(){
        return this.salario;
    }
    
    //Mutadores (set)
    public void cedula(double Nuevacedula){
        this.cedula =Nuevacedula;
    }
    
    
    public void setnombre(String Nuevonombre){
        this.nombre =Nuevonombre;
        
    }
    public void setdepartamento(String Nuevodepartamento){
        this.departamento =Nuevodepartamento;
    }
    
    public void setposicion(String Nuevaposicion){
        this.posicion =Nuevaposicion;
    }
    public void setsalario(double Nuevosalario){
        this.salario =Nuevosalario;
    }
    public void verDatos(){
       
        
        JOptionPane.showInputDialog("Cédula del empleado"+cedula);
        
        JOptionPane.showInputDialog("Nombre del empleado"+nombre);
        
        JOptionPane.showInputDialog("Departamento del empleado"+departamento);
        
        JOptionPane.showInputDialog("Posición del empleado"+posicion);
        
        JOptionPane.showInputDialog("Salario del empleado"+salario);
//To change body of generated methods, choose Tools | Templates.

    }

    Object dameDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

   

