/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Jhona
 */
public class Hospital {

    private String nomHospital;
    private Ciudad ciudad;
    private int numEspecialidades;
    private Doctor[] doctor;
    private Enfermero[] enfermero;
    private double totalSueldo;
    private String direcHospital;

    public void establecerNomHospital(String n) {
        nomHospital = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNumEspecialidades(int n) {
        numEspecialidades = n;
    }

    public void establecerDoctor(Doctor[] n) {
        doctor = n;
    }

    public void establecerEnfermero(Enfermero[] n) {
        enfermero = n;
    }

    public void establecerTotalSueldo(double n) {
        totalSueldo = n;
    }

    public void establecerDirecHospital(String n) {
        direcHospital = n;
    }

    public String obtnerNomHospital() {
        return nomHospital;
    }

    public Ciudad obtnerCiudad(Ciudad n) {
        return ciudad;
    }

    public int obtnerNumEspecialidades() {
        return numEspecialidades;
    }

    public Doctor[] obtnerDoctor() {
        return doctor;
    }

    public Enfermero[] obtnerEnfermero() {
        return enfermero;
    }

    public double obtnerTotalSueldo() {
        return totalSueldo;
    }

    public String obtnerDirecHospital() {
        return direcHospital;
    }
}
