package exo3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TriangleInterface extends Remote {
    public String trainglefigureA(int a) throws RemoteException;
    public String trainglefigureB(int a) throws RemoteException;
}
