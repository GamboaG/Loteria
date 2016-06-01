package Servidor;

import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import algodeloteria.Carta;
import algodeloteria.Tablero2;


public class MaquinaV2 implements Runnable{
	
	private Proceso p;
	private Socket 	s;
	private Thread	t;
	
	private static final Carta CARTANULL = null; 
	
	private PrintWriter			salida;
	private OutputStream 		salidaStream;
	private BufferedReader		entrada;
	private ObjectOutputStream	salidaObjeto;
	
	public MaquinaV2(Proceso p, Socket s){
		this.p = p;
		this.s = s;
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		
		try {
			
			salidaStream = s.getOutputStream();
			
			salida = new PrintWriter(
						salidaStream, true);
			
			salidaObjeto = new ObjectOutputStream(salidaStream);
			
			entrada = new BufferedReader( 
					new InputStreamReader(s.getInputStream()));
			
			
			//salida.println("HOLA");
			p.setMaquinaV2();
			
			while(!p.estado){
			//	salida.println("Esperarando por mas usuarios");
				Thread.sleep(3000);
			}
			
			//salida.println("Bienvenido al juego");
			//salida.println("Generando tablero ...");
                        
//                        int tab = entrada.read();
//                        
//                        System.out.println(tab);
//                        
//                        Tablero2 tablero = p.getTablero(2);
//			
//                        salida.print(tablero);
			
		
			
		
			Carta carta = CARTANULL;
			
			while(true){
				carta = p.getCarta();
				
				salidaObjeto.writeObject(carta);
				//salida.flush();
				Thread.sleep(3000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				salida.println("\nPerdiste !");
		}
		
	}
	
}