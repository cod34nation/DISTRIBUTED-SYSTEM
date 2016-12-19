/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ozora
 */
public class server 
{
    public static void main(String[] args) throws RemoteException {
    Registry registry = LocateRegistry.createRegistry(1099);
    
    operasi ops=new operasi();
    registry.rebind("data", ops);
    
        System.out.println("Server is Running");
    }
    
}
