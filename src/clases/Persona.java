/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author estudiante
 */
public class Persona {
    
     private String nombre;
    private String apellido;
    private String fecha_nacimienta;
    private String identidad;
    private String genero;
    private String direccion;
    private String email;
    private String telefono;
    private String celular;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String fecha_nacimienta, String identidad, String genero, String direccion, String email, String telefono, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimienta = fecha_nacimienta;
        this.identidad = identidad;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
    }

   

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimienta() {
        return fecha_nacimienta;
    }

    public void setFecha_nacimienta(String fecha_nacimienta) {
        this.fecha_nacimienta = fecha_nacimienta;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public int getedad(){
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse(this.fecha_nacimienta, fmt);
        LocalDate ahora = LocalDate.now();
        
        Period periodo = Period.between(fechaNac, ahora);
        
        return periodo.getYears();
    }
    
    public boolean get_Valaida_Correo(){
        
        return true;
    }
    
    public String getFullNombre(){
        
        return this.nombre+" "+this.apellido;
    }
}
