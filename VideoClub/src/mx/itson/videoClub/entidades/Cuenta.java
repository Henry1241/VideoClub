/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.videoClub.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.videoClub.enumeradores.Tipo;

/**
 * La clase se encarga de obtener los datos generales del archivo Json para
 * reflejarlos en su tabla correspondiente
 *
 * @author Enrique Gonzalez Leyva
 */
public class Cuenta {

    private String id;
    private String moneda;
    private int mes;
    private Cliente cliente;
    private List<Compra> compras;

    public Cuenta deserializar(String json) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta = new Gson().fromJson(json, Cuenta.class);
        } catch (Exception ex) {
            System.err.println("Ocurrio un error" + ex.getMessage());
        }
        return cuenta;
    }

    /**
     * Este metodo suma todos los valores de tipo Deposito.
     *
     * @param listaCompras
     * @return Regresa la suma de los depositos.
     */
    public double compras(List<Compra> listaCompras) {
        double totalCompras = 0;

        for (Compra c : listaCompras) {
            if (c.getTipo() == Tipo.COMPRA) {
                totalCompras += c.getCantidad();
            }

        }
        return totalCompras;
    }

    /**
     * Este metodo se encarfa de sumar todos los valores de tipo Retiro.
     *
     * @param listaRentas
     * @return Regresa el total de los retiros.
     */
    public double rentas(List<Compra> listaRentas) {
        double totalRentas = 0;

        for (Compra c : listaRentas) {
            if (c.getTipo() == Tipo.RENTA) {
                totalRentas += c.getCantidad();
            }

        }
        return totalRentas;
    }

    /**
     * El metodo se encarga de restar el total de los depositos y el total de
     * los retiros para obtener el subTotal.
     *
     * @param resultado
     * @return
     */
    public double suma(double resultado) {
        double suma = compras(compras) + rentas(compras);
        return resultado;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param Mes the Mes to set
     */
    public void setMes(int Mes) {
        this.mes = Mes;
    }

    public double saldoInicial(int mes) {

        double saldoInicial = 0;
        for (Compra c : this.compras) {

            for (int i = 0; i < mes; i++) {
                if (c.getFecha().getMonth() == i && c.getTipo() == Tipo.COMPRA) {
                    saldoInicial += c.getCantidad();
                } else if (c.getFecha().getMonth() == i && c.getTipo() == Tipo.RENTA) {
                    saldoInicial -= c.getCantidad();
                }
            }
        }

        return saldoInicial;

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the compras
     */
    public List<Compra> getCompras() {
        return compras;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

}
