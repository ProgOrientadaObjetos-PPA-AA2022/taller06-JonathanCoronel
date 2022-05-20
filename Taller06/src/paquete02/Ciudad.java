/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public class Ciudad {

    private String nomCiudad;
    private String provincia;

    public Ciudad(String nom, String prov) {
        nomCiudad = nom;
        provincia = prov;
    }

    public void establecerNomCIudad(String n) {
        nomCiudad = n;
    }

    public void establecerProvinci(String n) {
        provincia = n;
    }

    public String obtenerNomCIudad() {
        return nomCiudad;
    }

    public String obtenerProvinci() {
        return provincia;
    }
}
