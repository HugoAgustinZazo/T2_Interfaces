package org.example.t2_interfaces;

import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> alumnos = Arrays.asList(
                "Agustín Zazo Hugo",
                "Baltasar Méndez Liberto",
                "Brihuega García Marco",
                "Cals González Alejandro",
                "Castillo Quintanar Daniel",
                "Cazorla Asensio Víctor",
                "Corral Tejero Félix",
                "Cózar Esteban Marcos",
                "Goujón Guitérrez Diego",
                "Hernández Gómez Javier",
                "Jaén Martín Celia",
                "Moreno Jiménez Matías",
                "Pérez Mínguez Iván",
                "Pérez Navarro Alberto",
                "Ponce Plaza Sergio",
                "Pordomingo Fernández Jorge",
                "Ramos Mejías Marco",
                "Rodríguez García Mario",
                "Rodríguez Ruescas Adrián",
                "Strohush Loyish Alejandro"

        );
        int j=0;
        for(int i=0;i<alumnos.size();i++){
            if(i<9) {
                System.out.println(alumnos.get(i)+" "+ j + "" + (i+1) + ".jpg");
            }else {
                System.out.println(alumnos.get(i)+" "+ (i+1) + ".jpg");

            }
        }
    }
}
