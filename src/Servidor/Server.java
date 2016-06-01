package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String args[]) throws IOException{

		Socket 		s;
		Proceso 	p;

		
		ServerSocket 	ss = new ServerSocket(2927);
		
		while(true){
			
			p = new Proceso();
			
			for(int nc = 0; nc < 2; nc++){
				s = ss.accept();
				new MaquinaV2(p, s);
			}	
		}
	}
}
