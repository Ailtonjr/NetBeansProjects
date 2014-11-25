package jcodec;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 * 
 * @author Ailton Cardoso Jr
 *         Rômulo Goelzer Portolann
 */
public class ImagePanel extends JPanel{
    private BufferedImage imagem;

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }

    public ImagePanel() {
    }
     
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(imagem, 0, 0, getPreferredSize().width, getPreferredSize().height, null);
    }
    
    
    
}
