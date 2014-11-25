/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;


import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author iPotter
 */
    public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{

    public ServerImplements() throws Exception{
        super();
    }
    @Override
    public int soma(int x, int y){
        return (x+y);
    }
    @Override
    public int subtrai(int x, int y){
        return (x-y);
    }
    @Override
    public int multiplica(int x, int y){
        return (x*y);
    }
    @Override
    public int divide(int x, int y){
    return (x/y);
    }
    
}
