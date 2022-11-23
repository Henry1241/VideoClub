/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.videoClub.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Enrique Gonzalez Leyva
 */
public enum Entrega {
    
    @SerializedName("3")
    COMPRADO,
    @SerializedName("4")
    DEVUELTO,
    @SerializedName("5")
    RETRASO
}
