package com.mphasis.main.cui.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthenticationRemote extends Remote {
    public boolean validateUser(String username,String password) throws RemoteException;
}
