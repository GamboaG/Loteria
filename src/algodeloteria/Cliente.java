
package algodeloteria;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

/**
 *
 * @author gamboa
 */
public class Cliente implements Runnable {
    Socket              skt;
    ObjectInputStream   entradaObjeto;
    BufferedReader      entrada;
    PrintWriter        salida;
    Tablero2 t ;
    TipoTablero tt;
    Ventana m;
    
    public Cliente () throws IOException{
        tt= new TipoTablero();
        t = new Tablero2("Mitablero",tt.romantico());
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                m = new Ventana();
//                m.setVisible(true);
//                
//            }
//        });
//        t = new Thread(this);
//        
//    }
//    
//    public void iniciar(){
//        t.start();
    }
    
    

    @Override
    public void run() {
        Object temp= null;
        Carta tmp;
        try {
         skt = new Socket("127.0.0.1" , 2927);
         m= new Ventana();
         m.setVisible(true);
         m.pintarTablero(t);
       //int a = m.getidTablero()
         
         entradaObjeto = new ObjectInputStream(skt.getInputStream());
         salida = new PrintWriter(skt.getOutputStream(), true);
         
//         
//         salida.print(2);
//         
//         //Tablero2 tablero = (Tablero2) entradaObjeto.readObject();*/
//         
//         Tablero2 tablero = new Tablero2("Mio", new TipoTablero().catrinazo());
//         m.pintarTablero(tablero);
        
         while((temp = entradaObjeto.readObject()) != null){
             
            tmp = (Carta)temp;
            
            m.pintarCarta(tmp.path);
            
            
        
        }
         Thread.sleep(100);
                 
        }
        catch(IOException | ClassNotFoundException | InterruptedException e){
            JOptionPane.showMessageDialog(m, "ERROR DE ENTRADA" +e.getMessage());
        }
       
         
    }
}
