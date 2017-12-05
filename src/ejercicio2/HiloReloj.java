/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vespertino
 */
public class HiloReloj implements Runnable {

    private Gui gui;

    public HiloReloj(Gui gui) {
        this.gui = gui;
    }

    @Override
    public void run() {
        while (true) {
            try {
                gui.suma();

                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloReloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
