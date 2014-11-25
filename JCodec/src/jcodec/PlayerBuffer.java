/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcodec;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import javafx.scene.control.TreeItem;
import org.jcodec.api.FrameGrab;
import org.jcodec.common.FileChannelWrapper;

/**
 *
 * @author 5108250
 */
public class PlayerBuffer extends Thread{
    public String fileName;
    //public int fps = 30;
    //private final double frameTime = 1000/fps;
    private FrameGrab grabber;
    BlockingQueue<Object> framesToRender = new ArrayBlockingQueue<>(1000);

    public PlayerBuffer(String fileName) {
        this.fileName = fileName;
        try {
            this.grabber = new FrameGrab(new FileChannelWrapper(new FileInputStream(fileName).getChannel()));
        } catch (Exception ex) {
            System.out.println("Erro ao encontrar o arquivo " + ex);
        }
    }
    
    
    @Override
    public void run() {
        Object frame = null;
        
        do{
            try { 
                frame = grabber.getFrame();
                framesToRender.put(frame);
                System.out.println("frames" + framesToRender.size());
            } catch (Exception ex) {
                System.out.println("Erro ao pegar os frames do arquivo " + ex);
            }
        }while(frame != null);
    }
    
}
