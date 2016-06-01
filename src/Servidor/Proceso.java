package Servidor;
import algodeloteria.Tablero2;
import algodeloteria.TipoTablero;
import algodeloteria.Mazo;
import algodeloteria.Carta;

public class Proceso extends Thread{
	
	private volatile int 		numConexiones;
	public 	boolean				estado; 
	
	private Carta 				carta;
	private Mazo				mazo;

	private final static int 	NUMCARTAS  = 54;
	private final static int	MAXCONEXIONS = 2;
	private final static int 	TIEMPOESPERA = 5000;
	
	public Proceso(){
		numConexiones 	= 0;
		this.start();
	}
	
	public synchronized void setMaquinaV2(){
		
		/* Un proceso solo puede atender a 4 Maquinas 
		 * por ello cuando una maquina es asignada a este proceso 
		 * llama a este metodo para indicarle que esta lista
		 * la conexion con el cliente y que el le va a 
		 * atender  */
		numConexiones++;
	}
	
	public Tablero2 getTablero(int a){
            TipoTablero t= new TipoTablero();
            Tablero2 tt = null;
		/* Genera un tablero de 16 posiciones el cual 
		 * lo retorna a el metodo que lo haya llamado */
		switch(a){
                    case 1: tt=new Tablero2("Catrinazo",t.catrinazo());
                    break;
                    case 2: tt=new Tablero2("Romantico",t.romantico());
                    break;
                    case 3: tt=new Tablero2("ElGallo",t.elGallo());
                    break;
                    case 4: tt=new Tablero2("Diablo",t.elRojito());
                    break;
                }
                return tt;
		
	}
	
	
        @Override
        @SuppressWarnings("empty-statement")
	public void run(){
		
		while(numConexiones < MAXCONEXIONS)
			;
		
		estado = true;
		
		mazo = new Mazo();
		mazo.revolver();
		
		
		try{
			
			while(true){
				carta = mazo.sacar();
				Thread.sleep(3000); 
			}
		
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception f){
                        System.out.println(f.getMessage());
			carta = null;	
		}
		
	/*  byte carta			  = 0;
		byte cartasActuales[] = new byte[NUMCARTAS + 1]; 
		
		
		for(int i = 0; i <= NUMCARTAS; i++){
			
			if(cartasActuales[carta] == 0){
				cartasActuales[carta] = 1;
				this.carta = carta;
				
				try {
					Thread.sleep(TIEMPOESPERA);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				
				// genera la carta
				carta = (byte)(Math.random() * (NUMCARTAS - 1) + 1);
				
				while(cartasActuales[carta] == 1){
					if(carta < 10)
						carta = (byte)(carta + ((Math.random() * 40) + 1));
				
					else if(carta < 20)
						carta = (byte)(carta + ((Math.random() * 30) + 1));
				
					else if(carta < 30)
						carta = (byte)(carta + ((Math.random() * 20) + 1));
					
					else if(carta < 40)
						carta = (byte)(carta + ((Math.random() * 10) + 1));
					
					else if(carta < 50)
						carta = (byte)(carta - ((Math.random() * 25) + 1));
					
					else if(carta == 50)
						carta = (byte)(carta - ((Math.random() * 20) + 1));
				}
			}
		}*/
	}
	
	public Carta getCarta(){
		return carta;
	}
}
