package com.tp.exo1;

import java.rmi.*;

public interface Fib extends Remote {
    public String printFibonacci(int term) throws RemoteException;
}
