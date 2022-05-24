/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Hospital;
import paquete02.Ciudad;
import paquete02.Doctor;
import paquete02.Enfermero;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Hospital");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la Direccion del Hospital");
        String direc = entrada.nextLine();
        System.out.println("Ingrese la Ciudad donde se ubca el Hospital");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la Provincia");
        String prov = entrada.nextLine();
        Ciudad ciud = new Ciudad(ciudad, prov);
        System.out.println("Ingrese el numero de especialidades del Hospital");
        int espe = entrada.nextInt();
        System.out.println("Ingrese la cantidad de medicos a Ingresar");
        int numMedic = entrada.nextInt();
        entrada.nextLine();
        Doctor[] doc = new Doctor[numMedic];
        for (int i = 0; i < doc.length; i++) {
            System.out.println("Ingrese el Nombre del Medico");
            String nomDoc = entrada.nextLine();
            System.out.println("Ingrese el sueldo");
            double sueld = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese la Especialidad");
            String especialidad = entrada.nextLine();
            Doctor doctor = new Doctor(nomDoc, sueld, especialidad);
            doc[i] = doctor;
        }
        System.out.println("Ingrese la cantidad de Enfermeros(as) a Ingresar");
        int numenfer = entrada.nextInt();
        entrada.nextLine();
        Enfermero[] enfer = new Enfermero[numenfer];
        for (int i = 0; i < enfer.length; i++) {
            System.out.println("Ingrese el Nombre del Efermero(a)");
            String nomEnfer = entrada.nextLine();
            System.out.println("Ingrese el sueldo");
            double sueld = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese El tipo(nombramiento, contrato)");
            String tipo = entrada.nextLine();
            Enfermero enfermero = new Enfermero(nomEnfer, sueld, tipo);
            enfer[i] = enfermero;
        }
        Hospital hospi = new Hospital(nombre, direc, ciud, espe, doc, enfer);
        hospi.establecerTotalSueldo();
        System.out.println(hospi);
    }

}
