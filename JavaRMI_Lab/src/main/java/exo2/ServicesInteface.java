package exo2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicesInteface extends Remote {
    public int sommeint(int a , int b) throws RemoteException;;
    public int produitint(int a , int b)throws RemoteException;;
    public int soustractionint(int a , int b)throws RemoteException;;
    public int divisionint(int a , int b)throws RemoteException;;
}
