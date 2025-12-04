package com.tp.exo1;
import com.tp.exo1.Fib;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class FibImpl extends UnicastRemoteObject implements Fib {
    protected FibImpl() throws RemoteException {
    }
    public String printFibonacci(int terms)  throws RemoteException {
        int first = 0, second = 1;
        String s="les"+terms+" termes de fibonaci sont";

        for (int i = 1; i <= terms; i++) {
            s=s+first+" ";
            int next = first + second;
            first = second;
            second = next;
        }
        return s;
    }
}
