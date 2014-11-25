/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcodec;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import org.jcodec.api.FrameGrab;
import org.jcodec.common.FileChannelWrapper;


/**
 *
 * @author 5108250
 */
public class Player extends Thread {

    //Reprodutor reprodutor = null;
    ImagePanel reprodutor;
    private double tempo = 0;
    private String fileName;

    public Player() {
    }

    public Player(String fileName, double tempo, ImagePanel rep) throws Exception {
        this.tempo = tempo;
        this.fileName = fileName;
        this.reprodutor = rep;

    }

    @Override
    public void run() {
        reprodutor.setImagem(frame);
        reprodutor.repaint();

                
                
            } while (frame != null);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
