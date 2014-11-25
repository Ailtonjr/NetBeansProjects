/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcodec;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jcodec.api.FrameGrab;
import org.jcodec.common.FileChannelWrapper;

/**
 *
 * @author 5108250
 */
public class PlayerBuffer extends Thread{
    public String fileName;
    public int fps = 30;
    private final double frameTime = 1000/fps;
    private FrameGrab grabber;
    BlockingQueue<BufferedImage> buffer = new ArrayBlockingQueue<>(500);

    public PlayerBuffer(String fileName) {
        this.fileName = fileName;
        try {
            this.grabber = new FrameGrab(new FileChannelWrapper(new FileInputStream(fileName).getChannel()));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    @Override
    public void run() {
        BufferedImage frame = null;
        
        do{
            try { 
                frame = grabber.getFrame();
                buffer.put(frame);
                
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }while(frame != null);
    }
    
}
