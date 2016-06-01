/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algodeloteria;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author gamboa
 */
public class Mazo {
	
    private ArrayList<Carta> 	mazo; 
    private int		        tamanoActual;
    
    private final static int 	tamanoMazo = 54; 
  
    
    public Mazo(){
    	
       tamanoActual = tamanoMazo;
       this.mazo = new ArrayList<>(tamanoMazo);
       this.llenarMazo();
    }
    
    private void llenarMazo(){ // llena sin path's
    	String path;
        Carta carta = null;
        String[] nombres = {
        	 
             "gallo","diablito","dama","catrin","paraguas","sirena","escalera","botella",
             "barril","arbol","melon","valiente","gorrito","muerte","pera","bandera","bandolon",
             "violoncello","garza","pajarito","mano","bota","luna","cotorro","borracho","negrito",
             "corazon","sandia","tambor","camaron","jaras","musico","araña","soldado","estrella",
             "cazo","mundo","apache","nopal","alacran","rosa","calavera","campana","cantarito",
             "venado","sol","corona","chalupa","pino","pescado","palma","maceta","arpa","rana"};
        
        int[] idCarta = {
        	 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,
        	 17,18,19,20,21,22,23,24,25,26,27,28,29,
        	 30,31, 32,33,34,35,36,37,38,39,40,41,42,
        	 43,44,45,46,47,48,49,50,51,52,53,54};
        
                        
       for(int i = 0; i < tamanoMazo; i++){
           
            path = "/imagenes/" + idCarta[i] + ".jpg";
            carta = new Carta(nombres[i], idCarta[i], path);
            mazo.add(carta);
       }
        
    }
    
    
    public void revolver(){ 	
            Collections.shuffle(mazo); 
    }
    
    
    public Carta sacar() throws Exception{ 	
    	if(!mazo.isEmpty()){
    		Carta c = mazo.get(--tamanoActual);
    		mazo.remove(tamanoActual);
    		return c;
    	}
    	else{
    		throw new Exception("Mazo vacio");
    	}
    }
    

    @Override
    public String toString(){
         return mazo.toString(); //lol 
    }
    
}
