
package algodeloteria;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


 //@author gamboa
 
public class Tablero2 implements Serializable{
    
    private Carta[] distribucion;
    private String nombre;

    public Tablero2( String nombre, Carta[] distribucion) {
        this.distribucion = distribucion;
        this.nombre = nombre;
    }

    public Carta[]getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(Carta[] distribucion) {
        this.distribucion = distribucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.distribucion);
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Tablero2 other = (Tablero2) obj;
        return true;
    }
    
    
    
}
