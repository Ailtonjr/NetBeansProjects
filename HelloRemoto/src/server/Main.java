/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Naming;

/**
 *
 * @author iPotter
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Gestor gestor = new Gestor();
        Naming.rebind("http://localhost/msg", gestor);
    }
    
    
    
}
