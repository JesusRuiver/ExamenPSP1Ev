/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Vespertino
 */
public class Fichero implements Runnable {

    private Gui gui;
    private String url = "C:\\ProyectosNetBeans\\JesusRuiz\\fichero\\fichero.txt";

    public Fichero(Gui gui) {
        this.gui = gui;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {

                File fichero = new File(url);

                FileReader fr = new FileReader(fichero);

                BufferedReader br = new BufferedReader(fr);

                for (int j = 0; j < fichero.length(); j++) {

                    char caracter = (char) br.read();

                    File ficheroNuevo = new File("C:\\ProyectosNetBeans\\JesusRuiz\\fichero\\" + caracter + ".txt");

                }

                fr.close();

            }
        } catch (Exception e) {
        }

    }

}
