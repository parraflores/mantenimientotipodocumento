package entidades;
// Generated 14/07/2019 06:13:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private int idPersonal;
     private String nombre;
     private String dni;
     private String telefono;
     private String cargo;
     private String email;
     private String apellido;
     private Set atencions = new HashSet(0);

    public Personal() {
    }

	
    public Personal(int idPersonal, String nombre, String dni, String telefono, String cargo, String email, String apellido) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.cargo = cargo;
        this.email = email;
        this.apellido = apellido;
    }
    public Personal(int idPersonal, String nombre, String dni, String telefono, String cargo, String email, String apellido, Set atencions) {
       this.idPersonal = idPersonal;
       this.nombre = nombre;
       this.dni = dni;
       this.telefono = telefono;
       this.cargo = cargo;
       this.email = email;
       this.apellido = apellido;
       this.atencions = atencions;
    }
   
    public int getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Set getAtencions() {
        return this.atencions;
    }
    
    public void setAtencions(Set atencions) {
        this.atencions = atencions;
    }




}


