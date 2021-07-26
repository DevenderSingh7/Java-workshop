package com.mphasis.main.cui;

import com.mphasis.main.cui.rmi.AuthenticationImpl;
import com.mphasis.main.cui.rmi.AuthenticationRemote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Instantiating the implementation class
        AuthenticationImpl authenticationImpl= new AuthenticationImpl();
        try {



            // Exporting the object of implementation class
            // (here we are exporting the remote object to the stub)
            AuthenticationRemote stub = (AuthenticationRemote) UnicastRemoteObject.exportObject(authenticationImpl ,0);

            // Binding the remote object (stub) in the registry
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("authen", stub);
            //System.err.println("Server ready")
        } catch (RemoteException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
