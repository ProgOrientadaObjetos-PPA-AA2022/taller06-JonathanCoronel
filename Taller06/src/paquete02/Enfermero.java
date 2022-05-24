/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jhona
 */
public class Enfermero {

    private String nomEnfermero;
    private String tipo;
    private double sueldMensualEnfer;

    public Enfermero(String nom, double sueld, String tip) {
        nomEnfermero = nom;
        sueldMensualEnfer = sueld;
        tipo = tip;

    }

    public void establecerNomEnfermero(String n) {
        nomEnfermero = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldMensualEnfer(double n) {
        sueldMensualEnfer = n;
    }

    public String obtenerNomEnfermero() {
        return nomEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldMensualEnfer() {
        return sueldMensualEnfer;
    }
}
