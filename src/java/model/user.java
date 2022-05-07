/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SusanaHI
 */
public class user {
    
    public String nombre;
    public String apellido;
    public String grupoNegocios;
    public String planta;
    public String area;
    public String autoriza;
        
    public user(String nombreUser){
        this.nombre = nombreUser;
    }
    
    public String getNombre() {
        return nombre;
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

    public String getGrupoNegocios() {
        return grupoNegocios;
    }

    public void setGrupoNegocios(String grupoNegocios) {
        this.grupoNegocios = grupoNegocios;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }
    
}
