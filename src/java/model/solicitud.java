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
public class solicitud {
    
    public String tipoCambio;
    public String aplicacion;
    public String descripcionCambio;
    public String justificacionCambio;
    
    public solicitud(String tc1, String a1, String dc1, String jc1){
        this.setTipoCambio(tc1);
        this.setAplicacion(a1);
        this.setDescripcionCambio(dc1);
        this.setJustificacionCambio(jc1);        
    }
    
    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getDescripcionCambio() {
        return descripcionCambio;
    }

    public void setDescripcionCambio(String descripcionCambio) {
        this.descripcionCambio = descripcionCambio;
    }

    public String getJustificacionCambio() {
        return justificacionCambio;
    }

    public void setJustificacionCambio(String justificacionCambio) {
        this.justificacionCambio = justificacionCambio;
    }
    
}