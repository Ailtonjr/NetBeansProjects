/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcodec;

import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author 5108250
 */
public class Player extends Thread {
    public double fps = 30.0;
    private final double frameTime = 1000/fps;
    ImagePanel reprodutor;
    BufferedImage frame;
    PlayerBuffer threadPlayerBuffer;
    JLabel label;


    public Player() {
    }

    public Player(ImagePanel reprodutor, PlayerBuffer threadPlayerBuffer,JLabel label) throws Exception {
        this.reprodutor = reprodutor;
        this.threadPlayerBuffer = threadPlayerBuffer;
        this.label = label;
    }

    @Override
    public void run() {
        do {
            label.setText("Buffering...");
        } while (threadPlayerBuffer.framesToRender.size()<100);
        label.setText("");
        do {
            
            try {
                Thread.sleep((long) frameTime);
            } catch (InterruptedException ex) {
                System.out.println("Nao funcionou o Sleep do FrameTime" + ex);
            }
                System.out.println("quantos Frames tem ? " + threadPlayerBuffer.framesToRender.size());
                reprodutor.setImagem((BufferedImage) threadPlayerBuffer.framesToRender.poll());
                reprodutor.repaint();
        } while (true);
    }
}
