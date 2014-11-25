/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author iPotter
 */
public interface Mensageiro extends Remote{
    public String heloo(String nome)throws RemoteException;
}
