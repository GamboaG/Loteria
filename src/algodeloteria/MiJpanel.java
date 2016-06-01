package algodeloteria;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

 public class MiJpanel extends JPanel {

    private ImageIcon imagen;

    public MiJpanel() {
    }

    public MiJpanel(String rutaImagen) {
        if (rutaImagen != null) {
            imagen = new ImageIcon(getClass().getResource(rutaImagen));
        }
    }


    public void setImagen(String rutaImagen) {

        imagen = new ImageIcon(getClass().getResource(rutaImagen));
        
        repaint();
    }

    public void setImagen(ImageIcon nuevaImagen) {
        imagen = nuevaImagen;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }
}