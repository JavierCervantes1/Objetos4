/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author CUC
 */
public class Password {

    private long longitud;
    private String contra;

    public Password(String contra) {
        this.contra = contra;
        this.longitud = 8;
    }

    public Password(long longitud, String contra) {
        this.longitud = longitud;
        this.contra = contra;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String Fuerte() {
        String aux;
        if (this.getLongitud() >= 6) {
            aux = "Su contraseña es fuerte";
        } else {
            aux = "Su contraseña es debil";
        }
        return aux;
    }

    public String mostrar() {
        String aux;
        aux = "Longitud: " + this.getLongitud() + "\n"
                + "Contraseña: " + this.getContra() + "\n"
                + "Estado: " + this.Fuerte();
        return aux;
    }

}
