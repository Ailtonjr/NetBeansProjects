/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;

/**
 *
 * @author iPotter
 */
public interface RemoteInterface extends Remote{
    public int soma(int x, int y)throws Exception;
    public int subtrai(int x, int y) throws Exception;
    public int multiplica(int x, int y)throws Exception;
    public int divide(int x, int y)throws Exception;
    
}
