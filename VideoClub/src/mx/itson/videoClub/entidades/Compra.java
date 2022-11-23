/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.videoClub.entidades;

import java.util.Date;
import mx.itson.videoClub.enumeradores.Entrega;
import mx.itson.videoClub.enumeradores.Tipo;

/**
 * La clase se encarga de obtener los datos especificos de la compra desde el
 * archivo Json y reflejarlos en su tabla correspondiente.
 *
 * @author Enrique Gonzalez
 */
public class Compra {

    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;
    private Entrega entrega;

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the entrega
     */
    public Entrega getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

}
