package com.mphasis.main.cui.rmi;

import java.rmi.RemoteException;

public class AuthenticationImpl implements AuthenticationRemote{

    @Override
    public boolean validateUser(String username, String password) throws RemoteException {
        if(username.equalsIgnoreCase("Dev") && password.equals("pass"))
            return true;

        return false;
    }
}
