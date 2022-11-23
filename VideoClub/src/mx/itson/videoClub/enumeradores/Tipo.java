/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.videoClub.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * La clase permite identificar el tipo dependiendo de un numero encontrado en
 * el archivo Json e identificarlo en Java.
 *
 * @author Enrique
 */
public enum Tipo {

    @SerializedName("1")
    COMPRA,
    @SerializedName("2")
    RENTA

}
