/*
aqui se agregan las diferentes distribuciones de cartas que puede tener un tablero 
*/
package algodeloteria;

/**
 *
 * @author gamboa
 */
public  class TipoTablero {
     private Carta[] rutas;
    
     
    public TipoTablero() {
        this.rutas = new Carta[16];
    }
    public  Carta[] elGallo(){
       
        rutas[0]=new Carta(1);   rutas[4]= new Carta(22);
        rutas[1]=new Carta(11);  rutas[5]=new Carta(44);
        rutas[2]=new Carta(10);  rutas[6]=new Carta(42);
        rutas[3]= new Carta(26); rutas[7]=new Carta(27);
        
        rutas[8]=new Carta(13);   rutas[12]= new Carta(29);
        rutas[9]= new Carta(19);  rutas[13]=new Carta(5);
        rutas[10]=new Carta(6);   rutas[14]=new Carta(35);
        rutas[11]= new Carta(14); rutas[15]=new Carta(7);
        
        return rutas;
        
    }
    
    public Carta[] elRojito(){
        rutas[0]=new Carta(2);      rutas[8]=new Carta(21);
        rutas[1]= new Carta(29);    rutas[9]=new Carta(42);
        rutas[2]=new Carta(20);     rutas[10]=new Carta(15);
        rutas[3]= new Carta(26);    rutas[11]=new Carta(14);
        
        rutas[4]=new Carta(30);     rutas[12]=new Carta(29);
        rutas[5]= new Carta(19);    rutas[13]=new Carta(12);
        rutas[6]=new Carta(52);     rutas[14]=new Carta(53);
        rutas[7]= new Carta(9);     rutas[15]=new Carta(38);
      
        return rutas;
    }
    public Carta[] catrinazo(){
        rutas[0]=new Carta(4);      rutas[8]=new Carta(16);
        rutas[1]= new Carta(28);    rutas[9]=new Carta(41);
        rutas[2]=new Carta(21);     rutas[10]=new Carta(33);
        rutas[3]= new Carta(22);    rutas[11]=new Carta(34);
        
        rutas[4]=new Carta(31);     rutas[12]= new Carta(29);
        rutas[5]= new Carta(18);    rutas[13]=new Carta(12);
        rutas[6]=new Carta(53);     rutas[14]=new Carta(50);
        rutas[7]= new Carta(32);    rutas[15]=new Carta(8);
       
        return rutas;
    }
    public Carta[]romantico(){
        rutas[0]=new Carta(41);     rutas[8]=new Carta(16);
        rutas[1]=new Carta(40);     rutas[9]=new Carta(9);
        rutas[2]=new Carta(43);     rutas[10]=new Carta(10);
        rutas[3]= new Carta(42);    rutas[11]=new Carta(20);
        
        rutas[4]=new Carta(39);     rutas[12]=new Carta(51);
        rutas[5]= new Carta(36);    rutas[13]=new Carta(52);
        rutas[6]=new Carta(19);     rutas[14]=new Carta(14);
        rutas[7]= new Carta(17);    rutas[15]=new Carta(7);
      
        return rutas;
    }
    
     @Override
    public String toString(){
        return "sin representacion String";
    }
}
