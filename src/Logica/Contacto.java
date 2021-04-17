/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author netanel
 */
public class Contacto {
    String nombre;
    String apellido;
    String dni;
    String direccion;
    String telefono;
    String fechaNacimiento;
    
    public Contacto() {
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = "";
        this.fechaNacimiento = "";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getDni() {
        return this.dni;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
}
