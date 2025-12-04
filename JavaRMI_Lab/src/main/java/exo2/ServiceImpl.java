package exo2;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ServiceImpl extends UnicastRemoteObject implements ServicesInteface {
    protected ServiceImpl() throws RemoteException {}
    public int sommeint(int a, int b) throws RemoteException {
        return a+b;
    }
    public int produitint(int a, int b) throws RemoteException{
        return a*b;
    }
    public int soustractionint(int a, int b) throws RemoteException{
        return a-b;
    }
    public int divisionint(int a, int b) throws RemoteException{
        return a/b;
    }
}
