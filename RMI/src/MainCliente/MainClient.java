/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCliente;

import RMI.RemoteInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author iPotter
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try {
            Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1");
            RemoteInterface s = (RemoteInterface) myRegistry.lookup("Matematicas");
            int x=5,y=3;
            System.out.println("Soma: " + s.soma(x,y));
            System.out.println("Substração" + s.subtrai(x, y));
            System.out.println("Divisão" + s.divide(x, y));
            System.out.println("Multiplicação" + s.multiplica(x, y));
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
