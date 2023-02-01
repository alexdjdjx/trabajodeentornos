/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosjob;

import visual.Inicio;

/**
 *
 * @author Lex
 */
public class EntornosJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Para que se abra el JFrame
         */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
       
    }
    
}
