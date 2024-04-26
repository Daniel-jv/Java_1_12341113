package tarea_participaciones;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Tarea_Participaciones {

    public static void main(String[] args) {
        System.out.println("SE HA SELECCIONADO ALETORIAMENTE UN ESTUDIANTE:\n===============================================");
        ArrayList<String> estudiantes = new ArrayList();
        SecureRandom numerosAleatorios = new SecureRandom();
        estudiantes.add("Gabriel Ernesto Mejia Barcenas");
        estudiantes.add("Jose Fernando Alvarez Becerra");
        estudiantes.add("Halmar Andres Ordoñez Bulnes");
        estudiantes.add("Maximino Jose Rodriguez Calix");
        estudiantes.add("Andre Ibrahim Navas Casco");
        estudiantes.add("Nahun Francisco Vasquez Castañeda");
        estudiantes.add("Ayleen Daniela Escobar Cruz");
        estudiantes.add("Jafet Antonio Xirui Hou Diaz");
        estudiantes.add("Salvador Ignacio Macias Estrada");
        estudiantes.add("Erick Daniel Hernandez Garcia");
        estudiantes.add("David Emanuel Garcia Gomez");
        estudiantes.add("Andre Hechenbichler");
        estudiantes.add("José Roberto Serón Hernández");
        estudiantes.add("Bryan Jose Arita Lopez");
        estudiantes.add("Julio Ariel Cárcamo Merlo");
        estudiantes.add("Lia Dariella Erazo Milla");
        estudiantes.add("Hanne Michelle Mendoza Nuñez");
        estudiantes.add("Miguel Angel Moran Nuñez");
        estudiantes.add("Eduardo Jose Valdez Ortez");
        estudiantes.add("Jonatan Jaziel Vallecillo Peña");
        estudiantes.add("Aaron Antonio Castillo Pineda");
        estudiantes.add("Joel Edgardo Fuentes Pineda");
        estudiantes.add("Exdi Abimelekh Matamoros Ramos");
        estudiantes.add("Gabriel Alexis Mejia Servellon");
        estudiantes.add("Carlos Adrian Dominguez Torres");
        estudiantes.add("Jose David Rodriguez Velasquez");
        int elegido = 27;
        while(elegido > 26){
            elegido = 1 +numerosAleatorios.nextInt(estudiantes.size());
        }
        for (int i = 1; i <= estudiantes.size(); i++) {
            if(i == elegido){
                System.out.print("●");
            }else{
                System.out.print("○");
            }
            System.out.printf(" %2d  ", i);
            System.out.print(estudiantes.get(i-1));
            System.out.println();
        }
    }
    
}
