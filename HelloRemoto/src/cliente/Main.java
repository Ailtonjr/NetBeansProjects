/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.rmi.Naming;
import java.rmi.NotBoundException;



/**
 *
 * @author iPotter
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Mensageiro gerente = (Mensageiro) Naming.lookup("http://localhost/");
        System.out.println(gerente.heloo("Ailton Cardoso"));
    }


    
    
    
}
