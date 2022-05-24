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

    public Hospital(String nom, String direc, Ciudad ciu, int espe, Doctor[] doc,
            Enfermero[] enfer) {
        nomHospital = nom;
        direcHospital = direc;
        ciudad = ciu;
        numEspecialidades = espe;
        doctor = doc;
        enfermero = enfer;

    }

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

    public void establecerTotalSueldo() {
        double suma1 = 0;
        double suma2 = 0;

        for (int i = 0; i < obtnerDoctor().length; i++) {
            suma1 = suma1 + obtnerDoctor()[i].obtenerSueldMensual();
        }
        for (int i = 0; i < obtnerEnfermero().length; i++) {
            suma2 = suma2 + obtnerEnfermero()[i].obtenerSueldMensualEnfer();
        }

        totalSueldo = suma1 + suma2;
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

    @Override
    public String toString() {
        String resul = String.format("Hospital %s\nDirección : %s\nCiudad : %s\n"
                + "Provincia : %s\nNumero de especialidades : %d\n"
                + "Listado de Médicos :\n", nomHospital, direcHospital,
                ciudad.obtenerNomCIudad(), ciudad.obtenerProvinci(),
                numEspecialidades);
        for (int i = 0; i < obtnerDoctor().length; i++) {
            resul = String.format("%s-%s - %.2f - %s\n", resul,
                    obtnerDoctor()[i].obtenerNomDoctor(),
                    obtnerDoctor()[i].obtenerSueldMensual(),
                    obtnerDoctor()[i].obtenerEspecialidad());
        }
        resul = String.format("%s\nListado de Enfermeros(as)\n", resul);
        for (int i = 0; i < obtnerEnfermero().length; i++) {
            resul = String.format("%s-%s - %.2f - %s\n", resul,
                    obtnerEnfermero()[i].obtenerNomEnfermero(),
                    obtnerEnfermero()[i].obtenerSueldMensualEnfer(),
                    obtnerEnfermero()[i].obtenerTipo());
        }
        resul = String.format("%s\nTotal de sueldos a pagar por mes: %.2f\n",
                resul, totalSueldo);

        return resul;
    }
}
