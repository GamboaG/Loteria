
package algodeloteria;
import java.io.Serializable;
/**
 *
 * @author gamboa
 */
public class Carta implements Serializable {
    private String nombre;
    private int idCarta;
    public String path;
    
    
    public Carta(String n , int id ,String path){
        this.nombre = n;
        this.idCarta = id;
        this.path = path;
        
    }
   
    
    public Carta(String n, int id){
          this.nombre=n;
          this.idCarta = id;
    }
    
    public Carta(int id ){
        this.idCarta = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public String getPath() {
        this.path= "/imagenes/"+this.idCarta+".jpg";
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idCarta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        return this.idCarta == other.idCarta;
    }
   
    
    @Override
    public String toString(){
        return "\n"+this.nombre;
    }
    
}
