/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public class Doctor {

    private String nomDoctor;
    private String especialidad;
    private double sueldMensualDoc;

    public Doctor(String nom, String espe, double sueld) {
        nomDoctor = nom;
        especialidad = espe;
        sueldMensualDoc = sueld;
    }

    public void establecerNomDoctor(String n) {
        nomDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldMensual(double n) {
        sueldMensualDoc = n;
    }

    public String obtenerNomDoctor() {
        return nomDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldMensual() {
        return sueldMensualDoc;
    }

}
