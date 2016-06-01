/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algodeloteria;

import javax.swing.JFrame;

/**
 *
 * @author gamboa
 */
public class Test extends JFrame {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       

         Cliente r = new Cliente();
         Cliente r2 = new Cliente();
         Thread t = new Thread(r);
         t.start();
         Thread t2 = new Thread(r2);
         t2.start();
         
    }

}
