/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

import RMI.ServerImplements;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



/**
 *
 * @author iPotter
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Matematicas",new ServerImplements());            
            System.out.println("Servidor Iniciado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
