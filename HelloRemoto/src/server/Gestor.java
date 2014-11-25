/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import cliente.Mensageiro;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author iPotter
 */
public class Gestor extends UnicastRemoteObject implements Mensageiro{

    public Gestor() throws RemoteException {
        
    }

    @Override
    public String heloo(String nome) throws RemoteException {
        return "vai dormir";
    }

    
}
